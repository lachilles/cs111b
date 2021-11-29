/* Craig Persiko - EmployeeHierarchyExpansion
   CS 111B Exercise for Chapter 14 test program.
   Uses Person, Employee, SalariedEmployee, and 
   new HourlyEmployee classes to demonstrate polymorphism.

   YOUR JOB IS TO WRITE HourlyEmployee CLASS TO MAKE
   THIS PROGRAM WORK, TO PRODUCE THE SAMPLE OUTPUT
   AT BOTTOM.  YOUR HourlyEmployee CLASS MUST BE
   A SUBCLASS OF Employee.

   DO NOT CHANGE THIS FILE
*/

import java.util.Scanner;
import java.util.ArrayList;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i;
        String input = "starting"; // initialize so loop condition below is true

        ArrayList<Person> people = new ArrayList<Person>();

        System.out.println("This program allows you to enter info about people.");

        // a for-loop can have any condition you want:
        // in this case, count with i, but repeat until user enters 'q'
        for(i = 0; input.charAt(0) != 'q'; i++)
        {
            System.out.print("Is person #" + (i + 1) + " an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) ");
            input = scan.nextLine();
            if (input.charAt(0) == 'y') // Employee:
            {
                System.out.print("Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') ");
                input = scan.nextLine();
                if (input.charAt(0) == 's')
                { // SalariedEmployee object
                    people.add(new SalariedEmployee());
                }
                else if (input.charAt(0) == 'h')
                {  // HourlyEmployee
                    people.add(new HourlyEmployee());
                }
                else
                { // Employee object
                    people.add(new Employee());
                }
            }
            else if (input.charAt(0) == 'n')
            { // Person object
                people.add(new Person());
            }
            else // neither 'y' nor 'n': no Person. Maybe quit?
                continue; // skip the rest of the loop body

            // input this person's data. Because of polymorphism,
            // the appropriate input function will be called
            // (not necessarily the one defined in the Person class)
            people.get(i).input();

            // this function is defined in the Person class only,
            // but it works for all because of inheritance:
            people.get(i).sayGoodMorning();

            if(people.get(i) instanceof SalariedEmployee)  // if this is a SalariedEmployee
            {
                System.out.println("Your salary is $"
                        + ((SalariedEmployee)people.get(i)).monthsPay()
                        + " per month.");
            }
            else if(people.get(i) instanceof HourlyEmployee)  // if this is an HourlyEmployee
            {
                // Save a reference to the object, for easier coding:
                HourlyEmployee he = (HourlyEmployee)people.get(i);
                System.out.println("Your weekly pay is $"
                        + he.weeksPay());
                double hoursEntered = he.getHoursPerWeek();
                he.setHoursPerWeek(40);
                System.out.println("If you worked 40 hours per week, your weekly pay would be $"
                        + he.weeksPay());
                // return to original valued entered by user:
                he.setHoursPerWeek(hoursEntered);
            }
        } // end of for loop

        System.out.println("Here are all the people:");
        for(Person p : people)
            p.output();
    }
}

/* Sample Output:

This program allows you to enter info about people.
Is person #1 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) y
Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') h
Please enter first name: Ed
Please enter last name: Sheeran
Please enter Social Security Number: 123-45-6789
Please enter country of citizenship: UK
Please enter hourly rate: $100
Please enter expected hours to work each week: 30
Good morning, Ed Sheeran
Your weekly pay is $3000.0
If you worked 40 hours per week, your weekly pay would be $4000.0
Is person #2 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) y
Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') s
Please enter first name: John
Please enter last name: Legend
Please enter Social Security Number: 111-11-1111
Please enter country of citizenship: USA
Please enter salary: 1000000
Good morning, John Legend
Your salary is $83333.33333333333 per month.
Is person #3 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) y
Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') n
Please enter first name: Ray
Please enter last name: LaMontagne
Please enter Social Security Number: 222-22-2222
Please enter country of citizenship: USA
Good morning, Ray LaMontagne
Is person #4 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) n
Please enter first name: Bruno   
Please enter last name: Mars
Good morning, Bruno Mars
Is person #5 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) q
Here are all the people:
1       Ed      Sheeran     123-45-6789     UK
currently working 30.0 hours per week
2       John        Legend      111-11-1111     USA
3       Ray     LaMontagne      222-22-2222     USA
4       Bruno       Mars

*/
