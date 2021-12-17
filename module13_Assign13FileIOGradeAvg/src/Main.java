/* Assignment 13 File I/O for Grade Average
   CS 111B, Lianne Achilles

   This program read grades from an input file, and averages them in an output file.
*/
import java.io.*;
import java.util.Scanner;

class Main<NUM_SCORES>
{
    private static final int NUM_SCORES = 4;
    // named constant for the number of scores per student in file

    public static void main(String[] args)
    {
        Scanner inFile = null, keyIn;
        PrintWriter outFile = null;
        boolean loopNeeded;
        String inFilePath, outFileName;

        System.out.println("Welcome to the Grade Average Calculator.\n");

        // Set up keyboard input reader:
        keyIn = new Scanner(System.in);

        do {
            System.out.println("Please enter the name of a file to input: ");
            inFilePath = keyIn.nextLine();
            try
            {
                // Set up file input reader and open file:
                inFile = new Scanner(new File(inFilePath));
                loopNeeded = false; // if no exception from above
            }
            catch(IOException e)
            {
                System.out.println("Unable to open file: " + inFilePath);
                loopNeeded = true;
            }
        }while(loopNeeded);

        do
        {
            System.out.println("Enter name of output file to create: ");
            outFileName = keyIn.nextLine();

            try
            {
                // Set up file output stream and open file:
                outFile = new PrintWriter(new File(outFileName));
                averageTestScores(inFile, outFile);
                System.out.println("Average grades saved to " + outFileName);
                loopNeeded = false; // above line worked
            }
            catch(IOException e)
            {
                System.out.println("Unable to open file: " + outFileName);
                loopNeeded = true;
            }
            catch(Exception e)
            {
                System.out.printf("The file %s isn't in the right format: \n" +
                        "it should have 1 name followed by 4 numbers on each line,\n" +
                        "separated by spaces.".format(inFilePath));
                System.out.println(e.getMessage() + "4 scores should follow each name, " +
                        "with spaces in between.\nGrades could not be averaged.");
            }
        }while(loopNeeded);

    }

    private static void averageTestScores(Scanner inFile, PrintWriter outFile) throws Exception
    {
        String lineIn; // To store one line at a time from the file
        String[] lineData; // To store an array of data from one line of the file
        String testTaker;
        double averageTestScore = 0;

        while (inFile.hasNextLine()) // while there are lines in the file
        {
            lineIn = inFile.nextLine();
            lineData = lineIn.split(" "); // split on spaces
            if(lineData.length < 5) { // array should have 5 items (columns of data)
                throw new Exception("5 values should be in each line, separated by spaces, " +
                        "beginning with the name of the test taker followed by 4 test scores.");}
            testTaker = lineData[0];
            averageTestScore =
                    (Double.parseDouble(lineData[1]) + Double.parseDouble(lineData[2]) +
                            Double.parseDouble(lineData[3]) + Double.parseDouble(lineData[4]))
                            / NUM_SCORES;
            outFile.println(testTaker + " " + averageTestScore);
        }
        outFile.close();
    }

}

/*  *****  Sample Output  *****

Welcome to the Grade Average Calculator.
Please enter the name of a file to input:
trash
Unable to open file: trash
Please enter the name of a file to input:
module13_Assign13FileIOGradeAvg/src/grades.txt
Enter name of output file to create:
trash/trash
Unable to open file: trash/trash
Enter name of output file to create:
module13_Assign13FileIOGradeAvg/src/gradeAvg.txt
Average grades saved to module13_Assign13FileIOGradeAvg/src/gradeAvg.txt

> cat grades.txt
Biden 85 90 95 98
Trump 50 70 75 80
Obama 90 95 98 97
Bush 80 70 75 85
Clinton 90 95 85 99
Bush 85 95 90 94

> cat gradeAvg.txt
Here are the average grades:
Biden 92.0
Trump 68.8
Obama 95.0
Bush 77.5
Clinton 92.3
Bush 91.0

> java Main
Welcome to the Grade Average Calculator.
Please enter the name of a file to input:
module13_Assign13FileIOGradeAvg/src/badformat.txt
Enter name of output file to create:
module13_Assign13FileIOGradeAvg/src/gradeAvg.txt
The file module13_Assign13FileIOGradeAvg/src/badformat.txt isn't in the right format:
it should have 1 name followed by 4 numbers on each line,
separated by spaces. The following error was generated:
4 scores should follow each name, with spaces in between.
Grades could not be averaged.

> cat badformat.txt
Biden 85 90
Trump 50 70 75
Obama 90 95 98 97
Bush 80 70 75 85
Clinton 90 95 85 99Bush 85 95 90 94

*/
