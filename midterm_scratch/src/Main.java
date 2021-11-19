/* SubTeam
Code for CS 111B Midterm Test Coding Question
Written by Lianne Achilles

This program asks the user to enter 4 names for a team,
storing them in an array of Strings.
Then the program changes the array, replacing the first
team member with Craig.  Then this modified list of
names is printed on the screen.  You can see sample
output at the end of this file.
*/

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        String[] team;
        String nameToRemove, nameToAdd;

        System.out.println("Please enter 4 names for this team:");
        team = inputTeam(4);

        nameToRemove = team[0];
        nameToAdd = "Craig";
        System.out.println("Sorry, we need to replace " + nameToRemove
                + " with " + nameToAdd);
        substitute(team, nameToRemove, nameToAdd);

        System.out.println("Here is your team:");
        outputArray(team);
    }

    // DO NOT CHANGE THE ABOVE CODE.

    // inputTeam: Input and return an array of Strings,
    // with the specified number of elements (one int parameter).
    public static String[] inputTeam(int size)
    {
        String[]names = new String[size];
        Scanner keyIn = new Scanner(System.in);

        for(int i = 0; i< size; i++)
        {
            names[i] = keyIn.next();
        }
        return names;
    }  // end of inputTeam

    // substitute: Has 3 parameters: an array of Strings,
    //and two String names. Changes the array by replacing the
    //element containing the nameToRemove with the nameToAdd.
    public static void substitute(String[]team, String nameToRemove, String nameToAdd)
    {
        for (int i = 0; i < team.length; i++) {
            if (team[i] == nameToRemove)
                team[i] = nameToAdd;
        }
    }  // end of substitute

    // output the array, separated by newline:
    public static void outputArray(String[]team)
    {
        System.out.print(team[0]); // output first value
        // output rest of array with newline:
        for (int i = 1; i < team.length; i++)
            System.out.print("\n" + team[i]);
        System.out.println();
    } // end of outputArray

}

/* Sample output

Please enter 4 names for this team:
Bill
Michiko
Lianne
Emi
Sorry, we need to replace Bill with Craig
Here is your team:
Craig
Michiko
Lianne
Emi


Please enter 4 names for this team:
Jean
Mimi
Yong
Odie
Sorry, we need to replace Jean with Craig
Here is your team:
Craig
Mimi
Yong
Odie

*/
