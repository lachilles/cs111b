/* Tile class 
   CS 111B - Lianne Achilles
   This Tile class represents a Scrabble tile.
   
   This was the solution for the Chapter 12 Exercise.
   DO NOT CHANGE THIS FILE FOR THE CHAPTER 13 EXERCISE.
*/

class Tile
{
    char letter;
    int value;

    // static member variable:
    // initially, we have 0 Tiles, but this will change
    static int tileCount = 0;

    public Tile(char letter, int value)
    {
        this.letter = letter;
        this.value = value;
        tileCount++;  // count each Tile we instantiate
    }

    public char getLetter()
    {
        return letter;
    }

    public int getValue()
    {
        return value;
    }

    public String toString()
    {
        return letter + " with value: " + value;
    }

    // equal Tiles have the same letter and value
    public boolean equals(Tile other)
    {
        return letter == other.letter && value == other.value;
    }

    // when comparing Tiles, the value is all that matters
    public int compareTo(Tile other)
    {
        if(value < other.value)
            return -1;
        else if(value > other.value)
            return 1;
        else
            return 0;
    }

    // static member function, to
    // return count of Tiles created
    public static int getTileCount()
    {
        return tileCount;
    }
}
