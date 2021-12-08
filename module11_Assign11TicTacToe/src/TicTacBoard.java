/* Craig Persiko
   TicTacBoard.java
   Starter code for Assignment 11 in CS 111B

   A class representing a Tic Tac Toe board -
   both its user interface and its logical functionality.

   YOUR JOB IS TO WRITE THE BODY OF THE checkWinner METHOD BELOW
   SO THAT THE GAME STOPS WHEN SOMEONE WINS, OR WHEN THE BOARD IS FULL.
   LIKE SHOWN IN THE SAMPLE OUTPUT AT BOTTOM.
*/

import java.util.Scanner;

public class TicTacBoard
{
    private char[][] board;  // 2-D array of characters
    private char curPlayer; // the player whose turn it is (X or O)

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

        if(curPlayer == 'X')
            curPlayer = 'O';
        else
            curPlayer = 'X';
    }

    // If the game is over, print who won (if anyone),
    // and return true.  If the game is not over, return false.
    public boolean checkWinner()
    {
        // YOUR CODE GOES HERE
        return false; // The game never ends. CHANGE THIS
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
0 0

X| |
-----
 | |
-----
 | |

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 0

X| |
-----
 | |
-----
O| |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

X| |
-----
 |X|
-----
O| |

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 1

X| |
-----
 |X|
-----
O|O|

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

X| |
-----
 |X|
-----
O|O|X

Player X wins!

************************************************
*********** Running the program again **********
************************************************

 | |
-----
 | |
-----
 | |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
-1 1
Invalid entry: row and column must both be between 0 and 2 (inclusive).
Please try again.
It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 3
Invalid entry: row and column must both be between 0 and 2 (inclusive).
Please try again.
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
1 1
Invalid entry: Row 1 at Column 1 already contains: X
Please try again.
It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 0

 | |
-----
 |X|
-----
O| |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

X| |
-----
 |X|
-----
O| |

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

X| |
-----
 |X|
-----
O| |O

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

X| |X
-----
 |X|
-----
O| |O

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 1

X| |X
-----
 |X|
-----
O|O|O

Player O wins!

************************************************
*********** Running the program again **********
************************************************

 | |
-----
 | |
-----
 | |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

 | |
-----
 | |
-----
 | |X

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

O| |
-----
 | |
-----
 | |X

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

O| |X
-----
 | |
-----
 | |X

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

O| |X
-----
 |O|
-----
 | |X

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 2

O| |X
-----
 |O|X
-----
 | |X

Player X wins!

************************************************
*********** Running the program again **********
******************************************************
* Following is Extra Credit: determine if unwinnable *
******************************************************

 | |
-----
 | |
-----
 | |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

X| |
-----
 | |
-----
 | |

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 0

X| |
-----
 | |
-----
O| |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

X| |X
-----
 | |
-----
O| |

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 1

X|O|X
-----
 | |
-----
O| |

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

X|O|X
-----
 | |
-----
O| |X

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

X|O|X
-----
 |O|
-----
O| |X

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 1

X|O|X
-----
 |O|
-----
O|X|X

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 2

X|O|X
-----
 |O|O
-----
O|X|X

Nobody can win now. Game ends in a draw.

*/
