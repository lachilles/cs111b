/*
   Schedule.java by Lianne Achilles
   Assignment for Chapter 13 in CS 111B

   This class stores an ArrayList of Time objects,
   sorts them, and returns them via .toString()
*/

import java.util.ArrayList;
import java.util.Scanner;

class Schedule
{
    private ArrayList<Time> times;

    public Schedule()
    {
        times = new ArrayList<Time>();
        // Use Scanner to input times
        Scanner scan = new Scanner(System.in);
        String input = "starting"; // initialize so loop condition below is true

        System.out.print("Please enter the time for each meeting in hh:mm format, on a\n" +
                "separate line, and type 'end' on the final line to finish. \n");
        // create the list array
        while (!input.equals("end")) {
            input = scan.next();
            if (input.equals("end")) {
                break; // skip the rest of the loop body
            } else {
                times.add(new Time(input));
            }
        }
    }

    // Sort the Times ArrayList using
    // the Selection Sort algorithm
    public void sort()
    {
        int idxSmall, startIndex;
        for (startIndex = 0; startIndex < times.size() - 1;startIndex++)
        {
            idxSmall = indexOfSmallest(startIndex);

            if(idxSmall > startIndex) // make sure we didn't get -1 above.
                swapValues(idxSmall, startIndex);
        }
    }

    // return the index of the smallest value in times
    // starting at startIndex.
    // return -1 if there are no elements after startIndex.
    private int indexOfSmallest(int startIndex)
    {
        if(times == null || times.size() <= startIndex)
            return -1;

        int indexOfMin = startIndex; // initialize min so we can compare and find smallest value.

        for (int i = startIndex + 1; i < times.size(); i++)
        {
            if (times.get(i).compareTo(times.get(indexOfMin)) < 0) {
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    // Exchange times[p1] and times[p2].  Because Integers are immutable,
    // we must modify the ArrayList to make the changes stick.
    private void swapValues(int p1, int p2)
    {
        Time temp = times.get(p1);
        times.set(p1, times.get(p2));
        // above is like times[p1] = times[p2]
        times.set(p2, temp);
    }

    // Compose a string with the list items separated by spaces
    public String toString()
    {
        String s = ""; // start with empty string we can add to
        for (Time t : times) // autoboxing
            s += (t.toString() + "\n");
        return s;
    }
}

/* Sample Output:

Please enter the time for each meeting in hh:mm format, on a
separate line, and type 'end' on the final line to finish.
12:26
12:00
13:00
6:00
end
Here is your schedule, sorted in order:
06:00
12:00
12:26
13:00

Please enter the time for each meeting in hh:mm format, on a
separate line, and type 'end' on the final line to finish.
9:18
9:03
17:00
7:00
end
Here is your schedule, sorted in order:
07:00
09:03
09:18
17:00

 */
