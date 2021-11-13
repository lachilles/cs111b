/* Assign6SwapPointsStarter 
   CS 111B Starter Program for Assignment 6

   Written by Lianne Achilles
   Your job is to write the two missing functions
   to complete the program below. DO NOT CHANGE THE MAIN METHOD.
   - inputNewPlayerLocation: to input (x,y) coordinates 
     from user (using Scanner), then return a Point object 
     with those coordinates.
  - swapPoints: to swap the coordinates of two Point 
     objects. (Hint: To keep the main function's reference
     variables relevant, you can't swap Point objects 
     entirely. You need to change the x and y coordinates 
     inside the Point objects.)

   Uses a function to swap the coordinates 
   stored in two Point objects, and another 
   function to input coordinates and return
   a Point object with those coordinates.
*/

import java.awt.Point;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Point player1_location, player2_location;

        player1_location = inputNewPlayerLocation();
        player2_location = inputNewPlayerLocation();

        System.out.println("Player1 location: (" + player1_location.x
                +"," + player1_location.y + ")");
        System.out.println("Player2 location: (" + player2_location.x
                +"," + player2_location.y + ")");

        swapPoints(player1_location, player2_location);

        System.out.println("Player 1 and Player 2 have swapped locations!");
        System.out.println("Player1 location: (" + player1_location.x
                +"," + player1_location.y + ")");
        System.out.println("Player2 location: (" + player2_location.x
                +"," + player2_location.y + ")");
    }

  /* DO NOT CHANGE ANY OF THE ABOVE CODE.
     WRITE YOUR CODE HERE FOR THE TWO MISSING FUNCTIONS.
     LOOK CLOSELY AT THE FUNCTION CALLS ABOVE TO HELP YOU 
     FIGURE OUT HOW THESE MUST BE DEFINED AND WHAT THEY DO:
     - inputNewPlayerLocation: to input (x,y) coordinates 
     from user (using Scanner), then return a Point object 
     with those coordinates
   */

  static Point inputNewPlayerLocation()
  {
      int x, y;
      Point player_location;
      Scanner keyIn = new Scanner(System.in);

      System.out.print("Welcome, new player. Please enter your coordinates: \n");
      System.out.print("x: ");
      x = keyIn.nextInt();
      System.out.print("y: ");
      y = keyIn.nextInt();
      keyIn.nextLine();  // read the newline
      player_location = new Point(x, y);
      return player_location;
  }

  /* - swapPoints: function that swaps the coordinates of two Point
     objects.
  */
  static void swapPoints(Point one, Point two)
  {
      int temp_x, temp_y;
      temp_x = one.x;
      temp_y = one.y;
      one.x = two.x;
      one.y = two.y;
      two.x = temp_x;
      two.y = temp_y;
  }

}

/* Here is the Sample Output:

Welcome, new player. Please enter your coordinates:
x: 9
y: 18
Welcome, new player. Please enter your coordinates:
x: 3
y: 9
Player1 location: (9,18)
Player2 location: (3,9)
Player 1 and Player 2 have swapped locations!
Player1 location: (3,9)
Player2 location: (9,18)

Welcome, new player. Please enter your coordinates:
x: 12
y: 26
Welcome, new player. Please enter your coordinates:
x: 1
y: 31
Player1 location: (12,26)
Player2 location: (1,31)
Player 1 and Player 2 have swapped locations!
Player1 location: (1,31)
Player2 location: (12,26)

*/
