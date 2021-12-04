/* JaggedArrayAverageTestScores by Lianne Achilles
   Exercise 14 CS 111B
   Shows how a 2-D array can be jagged: have different numbers of columns for each row.
   Inputs test scores for courses - each course can have a different number of tests.
   Returns the average test score for each course.
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int numCourses, numTests;
        double[][] testScores;
        double sum=0.00, average=0.00, maxScore=0.00;

        System.out.print("How many courses are you taking? ");
        numCourses = s.nextInt();

        testScores = new double[numCourses][];
        // allocate an array of references to 1-D arrays (rows)

        for(int i = 0; i < numCourses; i++)
        {
            System.out.print("How many tests are in course number "
                    + (i+1) + "? ");
            numTests = s.nextInt();
            // allocate this row: a 1-D array of doubles:
            testScores[i] = new double[numTests];
        }

        for(int courseId=0; courseId < testScores.length; courseId++)
        {
            sum = 0;
            for(int testId=0; testId < testScores[courseId].length; testId++)
            {
                System.out.print("What was your grade on test "
                        + (testId+1) + " for course "
                        + (courseId+1) + "? ");
                testScores[courseId][testId] = s.nextDouble();
                sum += testScores[courseId][testId];
            }
            average = sum / testScores[courseId].length;
            System.out.print("The average for course " + (courseId+1) + " is " + average);
            if(average > maxScore)
                maxScore = average;
            System.out.println(); // blank line to separate courses
        }
        System.out.print("The highest average score is " + maxScore);
    }
}

/* Sample Output:
How many courses are you taking? 2
How many tests are in course number 1? 2
How many tests are in course number 2? 3
What was your grade on test 1 for course 1? 75
What was your grade on test 2 for course 1? 100
The average for course 1 is 87.5
What was your grade on test 1 for course 2? 85
What was your grade on test 2 for course 2? 90
What was your grade on test 3 for course 2? 95
The average for course 2 is 90.0
The highest average score is 90.0

How many courses are you taking? 3
How many tests are in course number 1? 2
How many tests are in course number 2? 2
How many tests are in course number 3? 2
What was your grade on test 1 for course 1? 60
What was your grade on test 2 for course 1? 100
The average for course 1 is 80.0
What was your grade on test 1 for course 2? 75
What was your grade on test 2 for course 2? 95
The average for course 2 is 85.0
What was your grade on test 1 for course 3? 100
What was your grade on test 2 for course 3? 90
The average for course 3 is 95.0
The highest average score is 95.0
*/
