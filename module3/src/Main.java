import java.util.Scanner;

/* DeleteName
   Assignment 4, Module 3, CS 111B, by Lianne Achilles
   Inputs an array of names, and deleting all occurrences of a specified name.
*/


class Main
{
    static Scanner keyIn = new Scanner(System.in);
    public static void main(String[] args)
    {
        // define variables
        String[] names;
        String nameToDelete;
        int size, i;
        boolean nameFound = false;

        System.out.print("How many names do you want to enter? ");
        size = keyIn.nextInt();
        keyIn.nextLine();  // read the newline

        names = new String[size];

        // create the array
        for (i=0; i < size; i++) {
            System.out.println("Enter a name: ");
            names[i] = keyIn.nextLine();
        }

        System.out.print("Which name are you looking for?\n");
        nameToDelete = keyIn.nextLine();

        for (i=0; i < size; i++)
            if(names[i].equals(nameToDelete)) {
                System.out.println("Removing " + nameToDelete + " from the array.");
                deleteFromArray(names, i);  // delete element number i from the array
                size--; // now we have one fewer element to output
                // in case there is another copy of nameToDelete in the array, we'll keep looping.
                // since we just moved element i+1 back to element i, we need to check this new element i.
                i--;
                nameFound = true;
            }

        if(!nameFound) {
            System.out.println("Name not found.");
        }

        System.out.println("Here are the remaining names:");
        outputArray(names, size);
    }

    // output the array, separated by commas:
    public static void outputArray(String [] names, int size)
    {
        System.out.print(names[0]); // output first value
        // output rest of array with commas:
        for (int i = 1; i < size; i++)
            System.out.print(" " + names[i]);
        System.out.println();
    } // end of outputArray

    // remove element indexToDelete from the array a
    public static void deleteFromArray(String [] a, int indexToDelete)
    {
        for(int i=indexToDelete; i < a.length-1; i++)
            a[i] = a[i+1];
    }
}

/* Sample output
How many names do you want to enter? 3
Enter a name:
Lianne
Enter a name:
Jean
Enter a name:
Odie
Which name are you looking for?
David
Name not found.
Here are the remaining names:
Lianne Jean Odie

Process finished with exit code 0

How many names do you want to enter? 4
Enter a name:
Jean
Enter a name:
Lianne
Enter a name:
Odie
Enter a name:
Jean
Which name are you looking for?
Jean
Removing Jean from the array.
Removing Jean from the array.
Here are the remaining names:
Lianne Odie

Process finished with exit code 0

 */
