/* Names and Ages Program CS 111B Assignment 2
   Written by Lianne Achilles
   Determines, for two people, if neither, one, or both of them are between 18-65
*/
package com.company;
import java.util.Scanner;

public class Main
{
    static Scanner keyIn = new Scanner(System.in);

    // would love a person class with name and age properties

    // get name and age inputs (no args)

    // check if age is in 18-65 range (takes name1, name2, age1, age2 args)
    // return Neither, Both, or one
    public static void main(String args[])
    {
        // define variables
        String name1, name2;          // names of person1 and person2
        int age1, age2;               // ages of person1 and person2
        boolean workingAge1, workingAge2;

        // get name and age inputs
        System.out.println("Please enter first person's name: ");
        name1 = keyIn.nextLine();
        System.out.printf ("Please enter %s's age: ", name1);
        age1 = keyIn.nextInt();
        keyIn.nextLine();  // read the newline
        // check if age is in 18-65 range
        workingAge1 = checkAgeRange(age1);

        System.out.println("Please enter second person's name: ");
        name2 = keyIn.nextLine();
        System.out.printf ("Please enter %s's age: ", name2);
        age2 = keyIn.nextInt();
        keyIn.nextLine();  // read the newline
        // check if age is in 18-65 range
        workingAge2 = checkAgeRange(age2);

        if (workingAge1 && workingAge2) {
            System.out.println("Both people are between 18 and 65.");
        } else if (!(workingAge1 || workingAge2)) {
            System.out.println("Neither person is between 18 and 65.");
        } else if (!workingAge1 && workingAge2) {
            System.out.printf("%s is between 18 and 65, but %s is not.", name2, name1);
        } else if (workingAge1 && !workingAge2) {
            System.out.printf("%s is between 18 and 65, but %s is not.", name1, name2);
        }
    } // End of main function

    //*******************************************************************
    // Function checkAgeRange accepts an age and returns a boolean on   *
    // whether or not the age is within 18-65 years old.                *
    //*******************************************************************

    public static boolean checkAgeRange(int age) {

        boolean workingAge;

        workingAge = age < 65 && age >= 18;

        return workingAge;
    } // End of function checkAgeRange

} // End of class Main
