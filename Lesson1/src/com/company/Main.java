package com.company;

/* AvgNumsFromCommandLine
   Exercise 4, Chapter 9, CS 111B, by Lianne Achilles

   Inputs numbers on the command line, and then
   stores them into an array,and outputs the
   average number on the screen.
*/

class Main
{
    public static void main(String[] args)
    {
        double[] numbers;
        int i=0, count;
        double num, sum=0.00, average=0.00;

        if(args == null || args.length < 1)
        {  // if nothing on command line
            System.out.println("usage: java Main 5 4 2 8\nTo average the numbers 5, 4, 2 and 8");
            return;  // exit the program
        }
        count = args.length;
        // allocate space for all the command-line arguments
        // to go into the array of numbers
        numbers = new double[count];

        for(String arg : args)
        { // for each command line argument:
            num = Double.parseDouble(arg); // convert to numeric format
            numbers[i] = num;
            i++;
            sum += num;
        }

        System.out.println("Here is your array of numbers: \n");
        outputArray(numbers, count);
        average = sum / count;
        System.out.printf("\nand their average is: %.4f ", average);

    }

    // Output the first numElements of the nums array,
    // separated by commas:
    public static void outputArray(double[] nums, int numElements)
    {
        System.out.print(nums[0]); // output first value
        // output rest of array with commas:
        for (int i = 1; i < numElements; i++)
            System.out.print(", " + nums[i]);
        System.out.println();
    } // end of outputArray
}

/* Sample output:

>  java -classpath /Users/lianneachilles/Code/cs111b/out/production/cs111b com.company.Main 9 18 9 3
Here is your array of numbers:

9.0, 18.0, 9.0, 3.0

and their average is: 9.7500

> java -classpath /Users/lianneachilles/Code/cs111b/out/production/cs111b com.company.Main 2.5 3 2.5 43.222 3
Here is your array of numbers:

2.5, 3.0, 2.5, 43.222, 3.0

and their average is: 10.8444

*/
