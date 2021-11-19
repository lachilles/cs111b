/* MidtermReview
Code for CS 111B Midterm Review Exercise
Written by Lianne Achilles

This program asks the user to enter 5 numbers,
storing them in an array of ints. Then the
program outputs the smallest of those numbers
and makes a Point object store the array's
first two numbers as its coordinates.
Finally, the program inputs the user's last
name and outputs "Hello Mx." followed by their
last initial.  You can see sample
output at the end of this file.
*/

import java.util.Scanner;
import java.awt.Point;

class Main
{
    static Scanner keyIn = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] nums;
        String lastName;
        char lastInitial;
        Point myPoint = new Point();

        System.out.println("Please enter 5 numbers:");
        nums = inputNums(5);

        outputMin(nums);

        changePoint(myPoint, nums);
        System.out.println("The first two numbers are now stored in this object:");
        System.out.println(myPoint);

// DO NOT CHANGE THE ABOVE CODE

        keyIn.nextLine();
        System.out.println("Please enter your last name: ");
        lastName = keyIn.next();
        lastInitial = lastName.charAt(0);
        System.out.println("Hello Mx. " + lastInitial);
    }
    //inputNums: Input and return an array of ints,
    //with the specified number of elements (one int parameter).
    public static int[] inputNums(int size)
    {
        int[]nums = new int[size];
        for(int i = 0; i< size; i++)
        {
            nums[i] = keyIn.nextInt();
        }
        return nums;
    } // end of inputNums

    //outputMin: Has 1 parameter: an array of ints.
    //Outputs the smallest number in the array.
    public static void outputMin(int[] nums)
    {
        int minValue = nums[0];
        for(int i = 1; i < nums.length; i++)
            if(nums[i] < minValue){
                minValue = nums[i];
            }
        System.out.println("The smallest value is " + minValue);
    } // end of outputMin

    //changePoint: Has two parameters: a Point object and
    //an array of ints. Makes the Point object store the first
    //two elements of the array as its coordinates.
    public static void changePoint(Point myPoint, int[] nums)
    {
        myPoint.x = nums[0];
        myPoint.y = nums[1];
    }
}

/* Sample output
   (PLEASE REPLACE THIS WITH THE OUTPUT THAT YOU GET):

Please enter 5 numbers:
1 14 2 9 18
The smallest value is 1
The first two numbers are now stored in this object:
java.awt.Point[x=1,y=14]
Please enter your last name:
Achilles
Hello Mx. A


Please enter 5 numbers:
11 6 9 3 20
The smallest value is 3
The first two numbers are now stored in this object:
java.awt.Point[x=11,y=6]
Please enter your last name:
Kim
Hello Mx. K

*/
