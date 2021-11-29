/* Main class to test Time class
   CS 111B Assignment 8 by Lianne Achilles

   This tests the Time class, which is used to store a time of day and output it.
   It also store the current time of day.
*/

import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String timeString;
        int numMeetings;

        System.out.print("What time is it now? ");
        timeString = scan.nextLine();
        Time.setCurTime(timeString);

        System.out.print("Current time: ");
        Time.showCurTime();
        System.out.println();

        System.out.print("How many meetings do/did you have today? ");
        numMeetings = scan.nextInt();
        scan.nextLine(); // dispose of newline character

        // DON'T CHANGE ANY OF THE ABOVE CODE
        // WRITE YOUR CODE HERE TO PRODUCE THE OUTPUT SHOWN BELOW
        // The comments below should help you figure out the steps

        Time[] times = new Time[numMeetings];

        // create the array
        for (int i=0; i < numMeetings; i++) {
            System.out.printf("What time is meeting #%d? ", i+1);
            timeString = scan.nextLine();
            times[i] = new Time(timeString);
        }

        System.out.print("Here are the times for your meetings that are later today:\n");
        // loop through times array and determine which meetings are later and last
        Time lastMeeting = times[0];
        int no_late_meetings;
        for (Time t : times) {
            if (t.isLaterToday()){
                System.out.println(t.toString());
                if (t.compareTo(lastMeeting) > 0) {
                    lastMeeting = t;

                }
            }
        }

        if (!lastMeeting.isLaterToday()) {
            System.out.print("You have no more meetings today!");
        } else {
            System.out.printf("Your last meeting of the day is at %s ", lastMeeting.toString());
        }
    }
}

/* Sample Output:
What time is it now? 18:00
Current time: 18:00

How many meetings do/did you have today? 2
What time is meeting #1? 10:00
What time is meeting #2? 14:00
Here are the times for your meetings that are later today:
You have no more meetings today!

How many meetings do/did you have today? 3
What time is meeting #1? 16:00
What time is meeting #2? 15:00
What time is meeting #3? 9:30
Here are the times for your meetings that are later today:
16:00
15:00
09:30
Your last meeting of the day is at 16:00

*/
