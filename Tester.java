import java.util.*;
public class Tester
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Battleship: Gauntlet, sir.");
        System.out.println("This is how you play the game:");
        System.out.println("One ship is gonna come and your objective is to take it out.");
        System.out.println("Once that ship is taken out, another will come and the process repeats");
        System.out.println("until there are no more ships.");
        System.out.println("This will all take place in a 6 by 6 space.");
        System.out.println("Input coordinates to attack the ship by typing an X number and a Y number,");
        System.out.println("making sure there is a space between those numbers");
        System.out.println("Example: 2 4, where X = 2 and Y = 4");
        System.out.println("With all that being said, let's tackle this gauntlet sir.");
        
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter code: ");
        String codeIn = kb.nextLine();
        
        int randXorY = (int)(Math.random() * 2); // 0 is X and 1 is Y
        int randX = (int)(Math.random() * 4) + 1;
        int randY = (int)(Math.random() * 4) + 1; // Constant lengths and random positions given by Math.random
        int[][] randShip1 = new int[2][];
        
        if (randXorY == 0)
        {
            randShip1[0] = new int[3];
            randShip1[1] = new int[1];
                        
            for (int i = 0; i < randShip1[0].length; i++)
            {
                randShip1[0][i] = randX + i;
            }
            
            randShip1[1][0] = randY; // set positions
            
            if (codeIn.equals("CoolJoo"))
            {
                for (int i = 0; i < randShip1[0].length; i++)
                {
                    System.out.println(randShip1[0][i]);
                }
                for (int i = 0; i < randShip1[1].length; i++)
                {
                    System.out.println(randShip1[1][i]);
                }
            }
            
            Battleship ship1 = new Battleship("Common Canine", "\nLength of 3", randShip1);
            ship1.daGame();
        }
        else
        {
            randShip1[0] = new int[1];
            randShip1[1] = new int[3];
            
            randShip1[0][0] = randX;
            
            for (int i = 0; i < randShip1[1].length; i++)
            {
                randShip1[1][i] = randY + i;
            }
            
            if (codeIn.equals("CoolJoo"))
            {
                for (int i = 0; i < randShip1[0].length; i++)
                {
                    System.out.println(randShip1[0][i]);
                }
                for (int i = 0; i < randShip1[1].length; i++)
                {
                    System.out.println(randShip1[1][i]);
                }
            }
            
            Battleship ship1 = new Battleship("Common Canine", "\nLength of 3", randShip1);
            ship1.daGame();
        }

        randXorY = (int)(Math.random() * 2);
        randX = (int)(Math.random() * 3) + 1;
        randY = (int)(Math.random() * 3) + 1;
        int[][] randShip2 = new int[2][];
        
        if (randXorY == 0)
        {
            randShip2[0] = new int[4];
            randShip2[1] = new int[1];
            
            for (int i = 0; i < randShip2[0].length; i++)
            {
                randShip2[0][i] = randX + i;
            }
            
            randShip2[1][0] = randY;
            
            if (codeIn.equals("CoolJoo"))
            {
                for (int i = 0; i < randShip2[0].length; i++)
                {
                    System.out.println(randShip2[0][i]);
                }
                for (int i = 0; i < randShip2[1].length; i++)
                {
                    System.out.println(randShip2[1][i]);
                }
            }
            
            Battleship ship2 = new Battleship("Big Bobby Boi", "\nLength of 4", randShip2);
            ship2.daGame();
        }
        else
        {
            randShip2[0] = new int[1];
            randShip2[1] = new int[4];
            
            randShip2[0][0] = randX;
            
            for (int i = 0; i < randShip2[1].length; i++)
            {
                randShip2[1][i] = randY + i;
            }
            
            if (codeIn.equals("CoolJoo"))
            {
                for (int i = 0; i < randShip2[0].length; i++)
                {
                    System.out.println(randShip2[0][i]);
                }
                for (int i = 0; i < randShip2[1].length; i++)
                {
                    System.out.println(randShip2[1][i]);
                }
            }
            
            Battleship ship2 = new Battleship("Big Bobby Boi", "\nLength of 4", randShip2);
            ship2.daGame();
        }

        randXorY = (int)(Math.random() * 2);
        randX = 1;
        randY = 1;
        int[][] randShip3 = new int[2][];
        
        if (randXorY == 0)
        {
            randShip3[0] = new int[4];
            randShip3[1] = new int[1];
            
            for (int i = 0; i < randShip3[0].length; i++)
            {
                if (i > 1)
                {
                    randShip3[0][i] = randX + i + 2;
                    continue;
                }
                
                randShip3[0][i] = randX + i;
            }
            
            randShip3[1][0] = randY;
            
            if (codeIn.equals("CoolJoo"))
            {
                for (int i = 0; i < randShip3[0].length; i++)
                {
                    System.out.println(randShip3[0][i]);
                }
                for (int i = 0; i < randShip3[1].length; i++)
                {
                    System.out.println(randShip3[1][i]);
                }
            }
            
            Battleship ship3 = new Battleship("Twin Trouble", "\nTwo ships of length 2 on the same line", randShip3);
            ship3.daGame();
        }
        else
        {
            randShip3[0] = new int[1];
            randShip3[1] = new int[4];
            
            randShip3[0][0] = randX;
            
            for (int i = 0; i < randShip3[1].length; i++)
            {
                if (i > 1)
                {
                    randShip3[1][i] = randY + i + 2;
                    continue;
                }
                
                randShip3[1][i] = randY + i;
            }
            
            if (codeIn.equals("CoolJoo"))
            {
                for (int i = 0; i < randShip3[0].length; i++)
                {
                    System.out.println(randShip3[0][i]);
                }
                for (int i = 0; i < randShip3[1].length; i++)
                {
                    System.out.println(randShip3[1][i]);
                }
            }
            
            Battleship ship3 = new Battleship("Twin Trouble", "\nTwo ships of length 2 on the same line", randShip3);
            ship3.daGame();
        }
        
        randXorY = (int)(Math.random() * 2);
        randX = 1;
        randY = 1;
        int[][] randShip4 = new int[2][];
        
        if (randXorY == 0)
        {
            randShip4[0] = new int[6];
            randShip4[1] = new int[1];
            
            for (int i = 0; i < randShip4[0].length; i++)
            {
                randShip4[0][i] = randX + i;
            }
            
            randShip4[1][0] = randY;
            
            if (codeIn.equals("CoolJoo"))
            {
                for (int i = 0; i < randShip4[0].length; i++)
                {
                    System.out.println(randShip4[0][i]);
                }
                for (int i = 0; i < randShip4[1].length; i++)
                {
                    System.out.println(randShip4[1][i]);
                }
            }
            
            Battleship ship4 = new Battleship("The Miller Grove", "\nThe ultimate weapon, length of 6", randShip4);
            ship4.daGame();
            ship4.score();
        }
        else
        {
            randShip4[0] = new int[1];
            randShip4[1] = new int[6];
            
            randShip4[0][0] = randX;
            
            for (int i = 0; i < randShip4[1].length; i++)
            {
                randShip4[1][i] = randY + i;
            }
            
            if (codeIn.equals("CoolJoo"))
            {
                for (int i = 0; i < randShip4[0].length; i++)
                {
                    System.out.println(randShip4[0][i]);
                }
                for (int i = 0; i < randShip4[1].length; i++)
                {
                    System.out.println(randShip4[1][i]);
                }
            }
            
            Battleship ship4 = new Battleship("The Miller Grove", "\nThe ultimate weapon, length of 6", randShip4);
            ship4.daGame();
            ship4.score(); // score() exclusive to ship4 because last ship
        }
    }
}