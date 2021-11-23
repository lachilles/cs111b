/* Scrabble test file for Chapter 13 Exercise
   CS 111B - Lianne Achilles
   This main function tests the Rack class
   which you are supposed to finish so that
   it works as shown below.
   
   DO NOT MODIFY THIS FILE.
   PLEASE MODIFY Rack.java,
   TO PRODUCE THE OUTPUT SHOWN AT BOTTOM.
*/

class Main
{
    public static void main(String[] args)
    {
        Rack craigTiles = new Rack();
        craigTiles.addTile(new Tile('H', 4));
        craigTiles.addTile(new Tile('E', 1));
        craigTiles.addTile(new Tile('L', 1));
        craigTiles.addTile(new Tile('L', 1));
        craigTiles.addTile(new Tile('O', 1));
        craigTiles.addTile(new Tile('Z', 10));
        craigTiles.addTile(new Tile('Y', 4));
        craigTiles.sortHighToLow();
        System.out.println("Craig's rack of tiles, in order from most valuable to least:");
        System.out.println(craigTiles);

        Rack bettoTiles = new Rack();
        bettoTiles.addTile(new Tile('E', 1));
        bettoTiles.addTile(new Tile('A', 1));
        bettoTiles.addTile(new Tile('S', 1));
        bettoTiles.addTile(new Tile('D', 2));
        bettoTiles.addTile(new Tile('W', 4));
        bettoTiles.addTile(new Tile('T', 1));
        bettoTiles.addTile(new Tile('N', 1));
        bettoTiles.sortHighToLow();
        System.out.println("Betto's rack of tiles, in order from most valuable to least:");
        System.out.println(bettoTiles);
    }
}

/* When this project is completed,
   it should produce the output shown below:

Craig's rack of tiles, in order from most valuable to least:
Z H Y L O E L 
Betto's rack of tiles, in order from most valuable to least:
W D S A E T N 

*/
