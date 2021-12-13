/* File I/O Exercise for CS 111B
   By Lianne Achilles

   From the computer and mathematical occupations in EmploymentDataSF_2020.csv,
   which occupation has the most workers, and what is their mean annual wage?
   Print that on the screen.

   Also, save to a separate file: the header line and all data for occupations with more than
   10,000 workers.

   Please write your program below to do all of the above.
   Your program should work even if the data in the file were different. So don't assume that most
   common computer occupation in SF is Software developers.
   Write your program to look at the data to figure this out.

   The code below is meant to help you get started, but
   PLEASE CHANGE THIS CODE AS MUCH AS YOU WANT, TO MAKE IT WORK FOR YOU.
*/

import java.io.*;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner fin = null, keyIn;
        PrintWriter outFile = null;
        boolean loopNeeded;
        String outFileName;

        System.out.println("Welcome to the Employment Data Analyzer.\n");

        // Set up keyboard input reader:
        keyIn = new Scanner(System.in);

        // setup output file
        do {
            System.out.println("Enter name of output file to create: ");
            outFileName = keyIn.nextLine();
            try
            {
                // Set up file output stream and open file:
                outFile = new PrintWriter(new File(outFileName));
                loopNeeded = false; // above line worked
            }
            catch(IOException e)
            {
                System.out.println("Unable to open file: " + outFileName);
                loopNeeded = true;
            }
        }while(loopNeeded);

        // Set up file input reader and open file:
        try
        {
            fin = new Scanner(new File("module13_ExFileIO/src/EmploymentDataSF_2020.csv"));
            displayMostWorkers(fin);
        } catch (IOException e) {  // handle file i/o errors:
            System.out.println("Unable to open file: EmploymentDataSF_2020.csv");
            System.out.println(e.getMessage());
            return; // end the program
        } catch (Exception e) {  // handle other errors:
            System.out.println("The file EmploymentDataSF_2020.csv isn't in the right format:");
            System.out.println("5 values should be in each line, separated by commas.");
            System.out.println(e.getMessage() + "\nOutput file is probably incomplete.");
            return; // end the program
        }

        try
        {
            fin = new Scanner(new File("module13_ExFileIO/src/EmploymentDataSF_2020.csv"));
            outputResult(fin, outFile);
            fin.close();
            outFile.close();
        }
        catch(IOException e)
        {
            System.out.println("Error reading or writing file: " + e.getMessage());
            System.out.println("Output file is probably incomplete.");
            return; // end the program
        }
    }

    // display which occupation has the most workers, and what is their mean annual wage?
    static void displayMostWorkers(Scanner fin)
    {
        String lineIn; // To store one line at a time from the file
        String[] lineData; // To store an array of data from one line of the file
        String occupation = null, annualWage = null;
        int workersIdx = 1, numWorkers = 0, mostWorkers = 0;

        // skip headerRow
        fin.nextLine();

        while (fin.hasNextLine()) // while there are lines in the file
        {
            // input the first (header) line from the file.
            lineIn = fin.nextLine();
            // split on commas, put individual values into lineData array:
            lineData = lineIn.split(",");
            numWorkers = Integer.parseInt(lineData[workersIdx]);
            if(numWorkers > mostWorkers) {
                mostWorkers = numWorkers;
                occupation = lineData[0];
                annualWage = lineData[4];
            }
        }

        System.out.println("The most common computer occupation in SF is " + occupation + ", with a " +
                "mean annual wage of $" + annualWage);
    }

    // read the text from "fin", and output the header line and all data for occupations with more
    // than 10,000 workers to "fout"
    static void outputResult(Scanner fin, PrintWriter fout)  throws IOException
    {
        String lineIn, headerRow;
        String[] lineData;
        // output the first (header) line from the file.
        headerRow = fin.nextLine();
        fout.println(headerRow);
        while (fin.hasNextLine()) // while there are lines in the file
        {
            // input the first (header) line from the file.
            lineIn = fin.nextLine();
            // split on commas, put individual values into lineData array:
            System.out.println(lineIn);
            lineData = lineIn.split(",");
            if(Integer.parseInt(lineData[1]) > 100000)
            {
                fout.println(lineIn);
            }
        }
    }
}

/*
Enter name of output file to create:
popularJobs.csv
The most common computer occupation in SF is Software developers and software quality assurance analysts and testers, with a mean annual wage of $144740
Computer systems analysts,15450,1.6,60.27,125350
Information security analysts,2590,1.1,65.82,136910
Computer and information research scientists,2330,4.6,78.53,163330
Computer network architects,4550,1.7,71.27,148250
Network and computer systems administrators,6700,1.2,51.3,106700
Database administrators and architects,3830,1.7,55.16,114730
Computer programmers,5690,1.9,60.3,125420
Software developers and software quality assurance analysts and testers,64310,2.6,69.59,144740
Web developers and digital interface designers,5990,2.3,54.76,113910
Computer occupations (all other),21270,3.5,60.33,125480
Actuaries,380,1,53.12,110500
Mathematicians,50,1.1,65.38,135980
Operations research analysts,2040,1.3,54.69,113760
Statisticians,1910,2.9,61.1,127080
Data scientists and all other mathematical science occupations,3170,3.2,71.48,148680

Process finished with exit code 0


*/
