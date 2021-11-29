/* Lianne Achilles  -  Employee.java
   Defines a class to store data on an
   Employee, which is a kind of Person.

   DO NOT CHANGE THIS FILE
*/

import java.util.Scanner;

class Employee extends Person
{
    protected String SSN, countryOfCitizenship;

    // default constructor:
    // use inherited constructor to assign an id and store null for names
    // then store null for SSN and country too
    public Employee()
    {
        super();  // optional: will automatically be called anyway
        SSN = null;
        countryOfCitizenship = null;
    }

    // constructor:
    // use inherited constructor to assign an id and store names
    // then store SSN and country
    public Employee(String first, String last, String socSecNum, String country)
    {
        // call Person constructor with parameters:
        super(first, last);

        // set Employee instance variables too
        SSN = socSecNum;
        countryOfCitizenship = country;
    }

    // output function: fully overrides Person's output method
    // ( Notice we don't call super.output() )
    // to output all data on one line
    @Override  // annotation so compiler verifies we're overriding correctly
    public void output()
    {
        System.out.println(id + "\t\t" + firstName + "\t\t" + lastName
                + "\t\t" + SSN + "\t\t" + countryOfCitizenship);
    }

    // input function: calls inherited input function, then inputs SSN and country
    @Override
    public void input()
    {
        Scanner s = new Scanner(System.in);

        // Call Person's input function to input name:
        super.input();

        // now input SSN and country:
        System.out.print("Please enter Social Security Number: ");
        SSN = s.nextLine();
        System.out.print("Please enter country of citizenship: ");
        countryOfCitizenship = s.nextLine();
    }
}
