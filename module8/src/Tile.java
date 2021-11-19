/* Scrabble Tile class file for Chapter 12 Exercise
   CS 111B - Lianne Achilles
   This Tile class works with the provided test main function.
*/

public class Tile {
    // declare instance variables:
    private char letter;
    private int value;
    private static int count=0;
    // count is the overall number of Tiles,
    // so it is static, and starts at 0.
    // But its value will be changed each time
    // the constructor is called.

    //constructor definitions:
    public Tile()
    {
    }

    // constructor to set values for instance variables
    public Tile(char l, int v)
    {
        letter = l;
        value = v;
        count++;
    }

    public static int getTileCount() {
        return count;
    }

    public char getLetter() {
        return letter;
    }

    public int getValue() {
        return value;
    }

    // The String format of a Tile includes a colon before the value.
    public String toString()
    {
        return String.format("%c with value: %d\n", letter, value);
    }

    // Two tiles are equal if their letter and value
    // are the same
    public boolean equals(Tile other)
    {
        return letter == (other.letter) && value == (other.value);
    }

    public int compareTo(Tile bestTile) {
        if (value < bestTile.value)
            return -1;
        else if (value == bestTile.value)
            return 0;
        else
            return 1;
    }
}


// when comparing Tiles, the value is all that matters
// WRITE YOUR compareTo METHOD HERE


/* Sample output of Main class

The word HELLO is worth 8 points
It has two of these: L with value: 1

*/
