/*
   Rack.java by Lianne Achilles
   Exercise for Chapter 13 in CS 111B

   This class stores an ArrayList of Tile objects,
   sorts them, and returns them via .toString()
*/

import java.util.ArrayList;

class Rack
{
    private ArrayList<Tile> tiles;

    public Rack()
    {
        tiles = new ArrayList<Tile>();
    }

    public void addTile(Tile t)
    {
        tiles.add(t);
    }

    // Sort the Tiles ArrayList using
    // the Selection Sort algorithm
    public void sortHighToLow()
    {
        int idxBig, startIndex;
        for (startIndex = 0; startIndex < tiles.size();startIndex ++)
        {
            idxBig = indexOfLargest(startIndex);

            if(idxBig > startIndex) // make sure we didn't get -1 above.
                swapValues(idxBig, startIndex);
        }
    }

    // return the index of the smallest value in tiles
    // starting at startIndex.
    // return -1 if there are no elements after startIndex.
    private int indexOfLargest(int startIndex)
    {
        if(tiles == null || tiles.size() <= startIndex)
            return -1;

        int indexOfMax = startIndex; // initialize max so we can compare and find largest value.

        for (int i = startIndex + 1; i < tiles.size(); i++)
        {
            if(tiles.get(i).value > tiles.get(indexOfMax).value)  // if we find a larger number
                // than the min
                indexOfMax = i;         // then this is the new max.
        }

        return indexOfMax;
    }

    // Exchange tiles[p1] and tiles[p2].  Because Integers are immutable,
    // we must modify the ArrayList to make the changes stick.
    private void swapValues(int p1, int p2)
    {
        Tile temp = tiles.get(p1);
        tiles.set(p1, tiles.get(p2));
        // above is like tiles[p1] = tiles[p2]
        tiles.set(p2, temp);
    }

    // Compose a string with the list items separated by spaces
    public String toString()
    {
        String s = ""; // start with empty string we can add to
        for (Tile t : tiles) // autoboxing
            s += (t.letter + " ");
        return s;
    }
}

/* Sample output
/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA 2.app/Contents/lib/idea_rt.jar=54436:/Applications/IntelliJ IDEA 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/lianneachilles/Code/cs111b/out/production/module9_ScrabbleRackSorting Main
Craig's rack of tiles, in order from most valuable to least:
Z H Y L O E L
Betto's rack of tiles, in order from most valuable to least:
W D S A E T N

Process finished with exit code 0

*/
