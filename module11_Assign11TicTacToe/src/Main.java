/* Lianne Achilles
   TicTacToe project for Assignment 11 in CS 111B
*/

class Main
{
    ///////  main  ////////
    // No changes needed in this function.
    // It declares the variables, initializes the game,
    // and plays until someone wins or the game becomes unwinnable.
    public static void main(String[] args)
    {
        TicTacBoard game = new TicTacBoard(3);
        game.playGame();
    }
}
