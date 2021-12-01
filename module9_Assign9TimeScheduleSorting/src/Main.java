/* Main class to test Schedule class
   for CS 111B Assignment 9 by Craig Persiko

   This tests the Schedule class, which is used to store
   an ArrayList of Time objects, and to sort them.

   YOUR JOB IS TO WRITE THE Schedule.java FILE to work
   with Time.java so that the following program produces
   output like shown below.
   Make sure to write your Selection Sort algorithm 
   using the Time object's .compareTo method. 
   You can copy my code from class examples and solutions,
   and then change it to fit your program.

   DO NOT CHANGE THIS FILE.
*/

class Main
{
    public static void main(String args[])
    {
        Schedule MondaySchedule = new Schedule();
        // above constructor asks user to enter meeting times
        MondaySchedule.sort();
        System.out.println("Here is your schedule, sorted in order:");
        System.out.print(MondaySchedule);
    }
}

/* Sample Output:

Please enter the time for each meeting in hh:mm format, on a
separate line, and type 'end' on the final line to finish.
16:00
16:50
9:00
10:00
15:00
end
Here is your schedule, sorted in order:
09:00
10:00
15:00
16:00
16:50

-----------------------------------------

Please enter the time for each meeting in hh:mm format, on a
separate line, and type 'end' on the final line to finish.
17:00
15:00
13:00
11:00
end
Here is your schedule, sorted in order:
11:00
13:00
15:00
17:00

*/
