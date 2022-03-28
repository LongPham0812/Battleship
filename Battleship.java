import java.util.*;
import java.util.Scanner;
public class Battleship
{
    private String shipName;
    private String description;
    
    private int[][] shipPos;
    private int[][] shipPosTwo;
    
    private String[] missText = {"Damn, almost had it.", "Argh, not quite.", "Bastard!"};
    private String[] hitText = {"Yeah, we got them.", "Hell yeah. Good work.", "That'll teach them!"};
    private String[] killText = {"Excellent work, sir!", "We're unstoppable!"};
    
    private static int guessCounter;

    public Battleship(String setName, String setDesc, int[][] position)
    {
        shipName = setName;
        description = setDesc;
        
        shipPos = position;
        shipPosTwo = new int[shipPos.length][];
        shipPosTwo[0] = new int[shipPos[0].length];
        shipPosTwo[1] = new int[shipPos[1].length];
    }

    private void setPos()
    {
        Arrays.fill(shipPosTwo[0], 1);
        Arrays.fill(shipPosTwo[1], 1); // second ship arrays to determine if ship gets hit somewhere
    }

    private String userGuess ()
    {
        String status = "Miss! " + missText[(int)(Math.random() * 3)];
        Scanner kb = new Scanner(System.in);

        while (checkKill() == false)
        {
            System.out.println("What coordinates should we attack, sir? ");
            int guessX = kb.nextInt();
            int guessY = kb.nextInt();
            
            if (guessX < 1 || guessX > 6 || guessY < 1 || guessY > 6)
            {
                return("But sir, these coordinates are out of bounds. Remember, 6 by 6. Try again."); // out of bounds guesses
            }
            
            if (shipPos[0].length > shipPos[1].length)
            {
                if (guessY == shipPos[1][0])
                {
                    for (int i = 0; i < shipPos[0].length; i++)
                    {
                        if (guessX == shipPos[0][i])
                        {
                            if (shipPosTwo[0][i] == 0)
                            {
                                return("But sir, we already hit that part of the ship. Try again.");
                            }
                            
                            shipPosTwo[0][i] = 0;
                            status = "Hit! " + hitText[(int)(Math.random() * 3)]; // horizontal ships
                        }
                    }
                }
            }
            else
            {
                if (guessX == shipPos[0][0])
                {
                    for (int i = 0; i < shipPos[1].length; i++)
                    {
                        if (guessY == shipPos[1][i])
                        {
                            if (shipPosTwo[1][i] == 0)
                            {
                                return("But sir, we already hit that part of the ship. Try again.");
                            }
                            
                            shipPosTwo[1][i] = 0;
                            status = "Hit! " + hitText[(int)(Math.random() * 3)]; // vertical ships
                        }
                    }
                }
            }

            return(status);
        }
        
        return(status);
    }

    private boolean checkKill()
    {
        boolean kill = false;

        if (shipPos[0].length > shipPos[1].length)
        {
            for (int i = 0; i < shipPos[0].length; i++)
            {
                if (shipPosTwo[0][i] == 0)
                {
                    kill = true;
                }
                else
                {
                    kill = false;
                    break; // horizontal ships
                }
            }
        }
        else
        {
            for (int i = 0; i < shipPos[1].length; i++)
            {
                if (shipPosTwo[1][i] == 0)
                {
                    kill = true;
                }
                else
                {
                    kill = false;
                    break; // vertical ships
                }
            }
        }

        return(kill);
    }

    public void daGame()
    {
        setPos();
        System.out.println("New ship approaching: " + shipName + description);

        while (checkKill() == false)
        {
            System.out.println(userGuess());
            guessCounter++;
        }

        System.out.println("You sank " + shipName + "! " + killText[(int)(Math.random() * 2)]);
    }

    public void score()
    {
        System.out.println("You've guessed " + guessCounter + " times.");
        
        if (guessCounter <= 60)
        {
            System.out.println("Good work out there, sir.");
        }
        else
        {
            System.out.println("Solid work, sir. Could have been better though.");
        }
    }
}
