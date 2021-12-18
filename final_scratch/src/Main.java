/* Mayors Names

  See instructions in Canvas
*/

import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner inFile = null, keyboard;
        String first, middle, last;
        ArrayList<FullName> mayorList = new ArrayList<FullName>();
        keyboard = new Scanner(System.in);

        System.out.println("We have a new mayor:");
        System.out.println("Please enter first name");
        first = keyboard.nextLine();
        System.out.println("Please enter middle name");
        middle = keyboard.nextLine();
        System.out.println("Please enter last name");
        last = keyboard.nextLine();


        // DO NOT CHANGE ANY OF THE ABOVE CODE.

        // ADD YOUR CODE HERE.
        // Instantiating a FullName object from the new mayor's name entered by the user, and adding
        // that object to the mayorList
        mayorList.add(new FullName(first, middle, last));

        try
        {
            // Set up file input reader and open file:
            inFile = new Scanner(new File("final_scratch/src/mayors.txt"));
            processFile(inFile, mayorList);
            inFile.close();
            System.out.println(mayorList);
        }
        catch(IOException e)
        {
            System.out.println("Error reading or writing file: mayors.txt " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("The file mayors.txt isn't in the right format:");
        }

        // DO NOT CHANGE ANY OF THE BELOW CODE.
        Collections.sort(mayorList);
        System.out.println("Here is the list of mayors, sorted by last name:");
        for(FullName mayorName : mayorList)
            System.out.println(mayorName);
    }

    //Inputting the names from mayors.txt
    //Instantiating a FullName object for each of those names from the file and adding them to the mayorList
    private static void processFile(Scanner inFile, ArrayList<FullName> mayorList) throws IOException {
        String[] lineData;
        String lineIn;

        while(inFile.hasNextLine()) // while there are lines in the file
        {
            lineIn = inFile.nextLine();
            lineData = lineIn.split(" "); // split on space
            mayorList.add(new FullName(lineData[0], lineData[1], lineData[2]));
        }
    }
}

/* Sample output
We have a new mayor:
Please enter first name
Lianne
Please enter middle name
Misae
Please enter last name
Achilles
[Lianne Misae Achilles, London Nicole Breed, Edwin Mah Lee, Gavin Christopher Newsom, Willie Lewis Brown, Francis Michael Jordan, Arthur Christ Agnos, Dianne Goldman Feinstein, George Richard Moscone]
Here is the list of mayors, sorted by last name:
Lianne Misae Achilles
Arthur Christ Agnos
London Nicole Breed
Willie Lewis Brown
Dianne Goldman Feinstein
Francis Michael Jordan
Edwin Mah Lee
George Richard Moscone
Gavin Christopher Newsom

>> After changing input filename to mayors2.txt
We have a new mayor:
Please enter first name
Jean
Please enter middle name
Hee
Please enter last name
Kim
Error reading or writing file: mayors.txt final_scratch/src/mayors.txt (No such file or directory)
Here is the list of mayors, sorted by last name:
Jean Hee Kim
 */
