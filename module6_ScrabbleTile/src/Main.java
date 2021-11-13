/* Scrabble test file for Chapter 11 Exercise
   CS 111B - Lianne Achilles
   This main function tests the Tile class
   which you are supposed to write.
   When this file is included in a project with
   a correct Tile class, it should produce
   the output shown below.

   DO NOT CHANGE THIS FILE
*/

class Main
{
    public static void main(String[] args)
    {
        Tile t1, t2, t3, t4, t5;
        int totalValue;

        t1 = new Tile('H', 4);
        t2 = new Tile('E', 1);
        t3 = new Tile('L', 1);
        t4 = new Tile('L', 1);
        t5 = new Tile('O', 1);

        totalValue = t1.getValue() + t2.getValue() + t3.getValue()
                + t4.getValue() + t5.getValue();

        System.out.print("The word ");
        System.out.print(t1.getLetter());
        System.out.print(t2.getLetter());
        System.out.print(t3.getLetter());
        System.out.print(t4.getLetter());
        System.out.print(t5.getLetter());
        System.out.println(" is worth " + totalValue + " points");

        if(t4.equals(t3))
        {
            System.out.print("It has two of these: ");
            System.out.println(t4);
        }
        else
        {
            System.out.print("Error: " + t3.toString() + " and ");System.out.println(t4.toString() + " aren't equal.");
        }
    }
}

/* When this file is included in a project with
   a correct Tile class, it should produce
   the output shown below:

The word HELLO is worth 8 points
It has two of these: L with value: 1

*/
