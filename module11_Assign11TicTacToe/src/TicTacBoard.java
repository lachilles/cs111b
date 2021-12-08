/* Lianne Achilles
   TicTacBoard.java
   Assignment 11 CS 111B

   A class representing a Tic Tac Toe board -
   both its user interface and its logical functionality.
*/

import java.util.Scanner;

public class TicTacBoard
{
    private char[][] board;  // 2-D array of characters
    private char curPlayer; // the player whose turn it is (X or O)
    private int moveCount = 0;

    // Constructor: board will be size x size
    public TicTacBoard(int size)
    {
        board = new char[size][size];

        // initialize the board with all spaces:
        for(int row=0; row < board.length; row++)
            for(int col=0; col < board[row].length; col++)
                board[row][col] = ' ';

        curPlayer = 'X';  // X gets the first move
    }

    public void playGame()
    {
        display();
        do
        {
            takeTurn();
            display();
        }while(!checkWinner());
    }

    ///////  display  ////////
    // Display the current status of the board on the
    // screen, using hyphens (-) for horizontal lines
    // and pipes (|) for vertical lines.
    public void display()
    {
        System.out.println();
        dispRow(0);
        System.out.println("-----");
        dispRow(1);
        System.out.println("-----");
        dispRow(2);
        System.out.println();
    }

    // Display the current status of row r of the board
    // on the screen, using hyphens (-) for horizontal
    // lines and pipes (|) for vertical lines.
    private void dispRow(int r)
    {
        System.out.println(board[r][0] + "|" + board[r][1]
                + "|" + board[r][2]);
    }

    ///////  takeTurn  ////////
    // Allow the curPlayer to take a turn.
    // Send output to screen saying whose turn
    // it is and specifying the format for input.
    // Read user's input and verify that it is a
    // valid move.  If it's invalid, make them
    // re-enter it.  When a valid move is entered,
    // put it on the board.
    public void takeTurn()
    {
        Scanner scan = new Scanner(System.in);
        int row, col;
        boolean invalid;

        do{
            invalid = false; // assume correct entry
            System.out.println("It is now " + curPlayer + "'s turn.");
            System.out.println("Please enter your move in the form row column.");
            System.out.println("So 0 0 would be the top left, and 0 2 would be the top right.");
            row = scan.nextInt();
            col = scan.nextInt();

            if(row < 0 || col < 0 || row > 2 || col > 2)
            {
                System.out.println("Invalid entry: row and column must both be between 0 and 2 (inclusive).");
                System.out.println("Please try again.");
                invalid = true;
            }
            else if(board[row][col] != ' ')
            {
                System.out.println("Invalid entry: Row " + row + " at Column " + col
                        + " already contains: " + board[row][col]);
                System.out.println("Please try again.");
                invalid = true;
            }
        }while(invalid);

        board[row][col] = curPlayer;
    }

    // If the game is over, print who won (if anyone),
    // and return true.  If the game is not over, return false.
    public boolean checkWinner()
    {
        // declare variables
        boolean foundWinner = false;

        // increment moveCounter
        moveCount += 1;

        // check end conditions
        // when moveCount = 9
        if (moveCount == 9)
        {
            System.out.println("Nobody can win now. Game ends in a draw.");
            return true;
        }

        // check 3 rows and check if there's 3 in a row.
        for(int row = 0; row < board.length; row++)
        {
            foundWinner = checkRows(row, curPlayer);
            if (foundWinner)
            {
                System.out.println("Player " + curPlayer + " wins!");
                return true;
            }
        }
        // loop through 3 columns and check if there's 3 in a row.
        for(int col = 0; col < board.length; col++)
        {
            foundWinner = checkColumns(col, curPlayer);
            if (foundWinner)
            {
                System.out.println("Player " + curPlayer + " wins!");
                return true;
            }
        }
        // check 2 diags
        if (checkLDiag(curPlayer) || checkRDiag(curPlayer))
        {
            System.out.println("Player " + curPlayer + " wins!");
            return true;
        }

        // swap players after done checking for winner.
        if(curPlayer == 'X')
            curPlayer = 'O';
        else
            curPlayer = 'X';
        return false; // The game never ends. CHANGE THIS
    }

    public boolean checkColumns(int col, char curPlayer)
    {
        int row =0;
        if(board[row][col] == curPlayer &&
                board[row+1][col] == curPlayer &&
                board[row+2][col] == curPlayer)
        {
            return true;
        }
        else
            return false;
    }

    public boolean checkRows(int row, char curPlayer)
    {
        int col =0;
        if(board[row][col] == curPlayer &&
                board[row][col+1] == curPlayer &&
                board[row][col+2] == curPlayer)
        {
            return true;
        }
        else
            return false;
    }

    public boolean checkLDiag(char curPlayer)
    {
        // left diagonal
        if(board[0][0] == curPlayer &&
                board[1][1] == curPlayer &&
                board[2][2] == curPlayer)
        {
            return true;
        }
        else
            return false;
    }

    public boolean checkRDiag(char curPlayer)
    {
        // right diagonal
        if(board[0][2] == curPlayer &&
                board[1][1] == curPlayer &&
                board[2][0] == curPlayer)
        {
            return true;
        }
        else
            return false;
    }
}

/* Sample Output:
 | |
-----
 | |
-----
 | |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

 | |
-----
 |X|
-----
 | |

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

O| |
-----
 |X|
-----
 | |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

O| |X
-----
 |X|
-----
 | |

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 0

O| |X
-----
O|X|
-----
 | |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 0

O| |X
-----
O|X|
-----
X| |

Player X wins!

 | |
-----
 | |
-----
 | |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

 | |
-----
 |X|
-----
 | |

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

O| |
-----
 |X|
-----
 | |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 1

O|X|
-----
 |X|
-----
 | |

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 1

O|X|
-----
 |X|
-----
 |O|

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 0

O|X|
-----
X|X|
-----
 |O|

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 2

O|X|
-----
X|X|O
-----
 |O|

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 0

O|X|
-----
X|X|O
-----
X|O|

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

O|X|O
-----
X|X|O
-----
X|O|

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

O|X|O
-----
X|X|O
-----
X|O|X

Nobody can win now. Game ends in a draw.

*/
