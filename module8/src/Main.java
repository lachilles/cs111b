/* Scrabble test file for Chapter 12 Exercise
   CS 111B - Lianne Achilles
   This main function tests the Tile class
   which you are supposed to modify from the 
   version we wrote for the Chapter 11 exercise.
*/

class Main
{
    public static void main(String[] args)
    {
        Tile[] word = new Tile[5];
        Tile bestTile; // will refer to the highest-value Tile
        int totalValue = 0; // will store the sum of all the Tile values

        word[0] = new Tile('H', 4);
        word[1] = new Tile('E', 1);
        word[2] = new Tile('L', 1);
        word[3] = new Tile('L', 1);
        word[4] = new Tile('O', 1);

        bestTile = word[0]; // starting point for comparison
        System.out.print("The word ");
        for(Tile t : word)  // for each Tile in the word
        {
            // add each Tile's value to totalValue:
            totalValue += t.getValue();

            // print each letter in the word:
            System.out.println(t.getLetter());

            // store the highest-value Tile in bestTile, using .compareTo:
            if (t.compareTo(bestTile) == 1)
                bestTile = t;

        }
        System.out.println(" is worth " + totalValue + " points");

        System.out.println("Its tile with the highest value is:");
        System.out.println(bestTile);

        System.out.println("You have used a total of "
                + Tile.getTileCount() + " tiles so far.");
    }
}

/* When this project is completed,
   it should produce the output shown below:

The word HELLO is worth 8 points
Its tile with the highest value is:
H with value: 4
You have used a total of 5 tiles so far.

*/
