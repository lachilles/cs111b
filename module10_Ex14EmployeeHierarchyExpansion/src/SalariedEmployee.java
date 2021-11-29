/* Lianne Achilles - SalariedEmployee.java - CS 111B
   Defines a class to store data on a Salaried Employee,
   which is a kind of Employee, which is a kind of Person.

   DO NOT CHANGE THIS FILE
*/

import java.util.Scanner;

class SalariedEmployee extends Employee
{
    protected double salary;

    // default constructor: assign an id, make strings null and salary 0.
    public SalariedEmployee()
    {
        // super() is automatically called.
        salary = 0;
    }

    // constructor to set all values (unique id automatically assigned)
    public SalariedEmployee(String first, String last, String socSecNum,
                            String country, double sal)
    {
        super(first, last, socSecNum, country);
        salary = sal;
    }

    // override input function to get salary too
    @Override
    public void input()
    {
        Scanner keyIn = new Scanner(System.in);

        // Call Employee's input function to input name, SSN, country:
        super.input();

        // now input salary:
        System.out.print("Please enter salary: ");
        salary = keyIn.nextDouble();
    }

    // new for this class: returns montly salary.
    public double monthsPay()
    {
        return salary / 12.0;
    }
}
