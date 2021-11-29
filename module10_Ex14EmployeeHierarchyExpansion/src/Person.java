/* Craig Persiko  -  Person.java
   Defines a class to store data on a person.

   DO NOT CHANGE THIS FILE
*/

import java.util.Scanner;

class Person
{
    private static int nextId = 1;

    // these "protected" instance variables are accessible by
    // this class and subclasses of Person, but not by other classes:
    protected int id;  // unique ID number for each person
    protected String firstName;
    protected String lastName;

    // default constructor: assign an id and store null for names
    public Person()
    {
        assignNewId();
        firstName = null;
        lastName = null;
    }

    // parameterized constructor: assign an id and store names
    public Person(String first, String last)
    {
        assignNewId();
        firstName = first;
        lastName = last;
    }

    // display id and name on screen
    public void output()
    {
        System.out.println(id + "\t\t" + firstName
                + "\t\t" + lastName);
        // "\t" is a tab character
    }

    // Greet the person by name
    public void sayGoodMorning()
    {
        System.out.println("Good morning, " + firstName + " " + lastName);
    }

    // Use Scanner to input name
    public void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter first name: ");
        firstName = scan.nextLine();
        System.out.print("Please enter last name: ");
        lastName = scan.nextLine();
    }

    // Assigns an Id to this person and increments nextId
    private void assignNewId()
    {
        id = nextId;
        nextId++;
    }
}
