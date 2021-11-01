/* CS 111B Exercise for Chapter 7: NameArray
   Written by Lianne Achilles
   This program asks the user for number of names they would like to input. Then asks them to input
   the names. Then displays the names in reverse order and prints the longest name.
*/
package com.company;
import java.util.Scanner;

public class Main
{
    static Scanner keyIn = new Scanner(System.in);

    public static void main(String args[]) {
//        // define variables
        String names[];
        String longestName;
        int size, i;

        System.out.print("How many names do you want to enter? ");
        size = keyIn.nextInt();
        keyIn.nextLine();  // read the newline

        names = new String[size];

        // create the array
        for (i=0; i < size; i++) {
            System.out.println("Enter a name: ");
            names[i] = keyIn.nextLine();
        }
        // print array in reverse order
        System.out.println("Here are the names you entered, in reverse order:\n");
        for (i=names.length - 1; i >= 0; i--)
            System.out.print(names[i] + "\n");

        //
        longestName = getLongestName(names);
        System.out.printf("\nHere is the longest name, with %d characters: %s",
                longestName.length(), longestName);
    } // End of main function

    //*******************************************************************
    // Function getLongestName accepts an array of names and returns    *
    // the longest one.                                                 *
    //*******************************************************************

    static String getLongestName(String names[]) {

        int index = 0;
        int nameLength = names[0].length();

        for(int i=1; i< names.length; i++) {
            if(names[i].length() > nameLength) {
                index = i; nameLength = names[i].length();
            }
        }
        return names[index];
    } // End of function getLongestName

} // End of class Main

///Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA 2.app/Contents/lib/idea_rt.jar=54877:/Applications/IntelliJ IDEA 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/lianneachilles/Code/cs111b/out/production/cs111b com.company.Main
//How many names do you want to enter? 3
//Enter a name:
//Jean
//Enter a name:
//Lianne
//Enter a name:
//Odie
//Here are the names you entered, in reverse order:
//
//Odie
//Lianne
//Jean
//
//Here is the longest name, with 6 characters: Lianne
//Process finished with exit code 0


///Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA 2.app/Contents/lib/idea_rt.jar=54988:/Applications/IntelliJ IDEA 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/lianneachilles/Code/cs111b/out/production/cs111b com.company.Main
//How many names do you want to enter? 4
//Enter a name:
//Bill
//Enter a name:
//Michiko
//Enter a name:
//Lianne
//Enter a name:
//Emi
//Here are the names you entered, in reverse order:
//
//Emi
//Lianne
//Michiko
//Bill
//
//Here is the longest name, with 7 characters: Michiko
//Process finished with exit code 0
