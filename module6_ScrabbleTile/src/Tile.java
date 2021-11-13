/* Scrabble Tile class file for Chapter 11 Exercise
   CS 111B - Lianne Achilles
   This Tile class works with the provided test main function.
*/

public class Tile {
    // declare instance variables:
    private char letter;
    private int value;

    //constructor definitions:
    public Tile()
    {
        // Empty constructor just to allow Tile to be
        // constructed with null strings for its
        // instance variables.
    }

    // constructor to set values for instance variables
    public Tile(char l, int v)
    {
        letter = l;
        value = v;
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
}

/* Sample output of Main class

The word HELLO is worth 8 points
It has two of these: L with value: 1

*/
