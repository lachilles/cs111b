/* DeDup
   CS 111B Assignment 5

   Written by Lianne Achilles

   This program removes duplicates from the series of numbers specified on
   the command line.
*/

class Main
{
    public static void main(String[] args)
    {
        int[] input;
        int i=0, count;
        int num = 0;

        if(args == null || args.length < 1)
        {  // if nothing on command line
            System.out.println("usage: java Main 5 4 2 4 8\nTo remove duplicates from the numbers" +
                    " 5, 4, 2, 4 and 8");
            return;  // exit the program
        }
        count = args.length;
        // allocate space for all the command-line arguments
        // to go into the array of numbers
        input = new int[count];

        // not sure if this is necessary
        for(String arg : args)
        { // for each command line argument:
            num = Integer.parseInt(arg); // convert to numeric format
            input[i] = num;
            i++;
        }

        // create new array
        int[] deduped = new int[input.length];
        int j=0;
        // find duplicates and count unique nums, j
        for(int n : input) {
            if(!isDuplicate(deduped, n))
                deduped[j++] = n;
        }

        System.out.println("Here is your array of numbers: \n");
        outputArray(deduped, j);
    }

    // Output the first numElements of the nums array,
    // separated by commas:
    public static void outputArray(int[] nums, int numElements)
    {
        System.out.print(nums[0]); // output first value
        // output rest of array with commas:
        for (int i = 1; i < numElements; i++)
            System.out.print(", " + nums[i]);
        System.out.println();
    } // end of outputArray

    // boolean function that takes an array of ints and a value in it, and checks if it's a
    // duplicate.
    public static boolean isDuplicate(int[] input, int num) {
        for (int i: input) {
            if(i==num)
                return true;
        }
        return false;
    }
}

// Sample output
//$ java -classpath /Users/lianneachilles/Code/cs111b/out/production/module4 Main 1 1 4 2 9 1 9 1 3 8 1 8
//        Here is your array of numbers:
//
//        1, 4, 2, 9, 3, 8

//$ java -classpath /Users/lianneachilles/Code/cs111b/out/production/module4 Main
//        usage: java Main 5 4 2 4 8
//        To remove duplicates from the numbers 5, 4, 2, 4 and 8

// $ java -classpath /Users/lianneachilles/Code/cs111b/out/production/module4 Main 9 1 8 1 9
//Here is your array of numbers:
//
//9, 1, 8
