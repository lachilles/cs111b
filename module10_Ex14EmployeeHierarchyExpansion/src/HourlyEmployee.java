/* Lianne Achilles  -  HourlyEmployee.java
   Defines a class to store data on an Hourly Employee,
   which is a kind of Employee, which is a kind of Person.
*/

import java.util.Scanner;

class HourlyEmployee extends Employee {
    protected double expectedHoursPerWeek;
    protected double hourlyRate;

    // default constructor: assign an id, make strings null and salary 0.
    public HourlyEmployee() {
        // super() is automatically called.
        expectedHoursPerWeek = 0;
        hourlyRate = 0;
    }

    // constructor to set all values (unique id automatically assigned)
    public HourlyEmployee(String first, String last, String socSecNum,
                          String country, double hr, double r) {
        super(first, last, socSecNum, country);
        this.expectedHoursPerWeek = hr;
        this.hourlyRate = r;
    }


    public void setHoursPerWeek(double hr)
    {
        this.expectedHoursPerWeek = hr;
    }

    public double getHoursPerWeek() {
        return this.expectedHoursPerWeek;
    }


    // override input function to get hourlyRate too
    @Override
    public void input()
    {
        Scanner keyIn = new Scanner(System.in);

        // Call Employee's input function to input name, SSN, country:
        super.input();

        // now input hourly rate and hours per week:
        System.out.print("Please enter hourly rate: ");
        hourlyRate = keyIn.nextDouble();
        System.out.print("Please enter expected hours to work each week: ");
        expectedHoursPerWeek = keyIn.nextDouble();
    }

    // override output function to output the expected hours per week
    @Override
    public void output()
    {
        System.out.println(id + "\t\t" + firstName + "\t\t" + lastName
                + "\t\t" + SSN + "\t\t" + countryOfCitizenship);
        System.out.printf("currently working %f hours per week\n", expectedHoursPerWeek);
    }


    // new for this class: returns weekly salary.
    public double weeksPay()
    {
        return expectedHoursPerWeek * hourlyRate;
    }
}

/*
This program allows you to enter info about people.
Is person #1 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) y
Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') h
Please enter first name: Cree
Please enter last name: Larson
Please enter Social Security Number: 123456789
Please enter country of citizenship: USA
Please enter hourly rate: 40
Please enter expected hours to work each week: 40
Good morning, Cree Larson
Your weekly pay is $1600.0
If you worked 40 hours per week, your weekly pay would be $1600.0
Is person #2 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) y
Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') s
Please enter first name: Yuko
Please enter last name: Nagara
Please enter Social Security Number: 111111111
Please enter country of citizenship: Japan
Please enter salary: 100000
Good morning, Yuko Nagara
Your salary is $8333.333333333334 per month.
Is person #3 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) y
Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') n
Please enter first name: Lianne
Please enter last name: Acilles
Please enter Social Security Number: 333333333
Please enter country of citizenship: USA
Good morning, Lianne Acilles
Is person #4 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) n
Please enter first name: Odie
Please enter last name: Achilles
Good morning, Odie Achilles
Is person #5 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) q
Here are all the people:
1		Cree		Larson		123456789		USA
currently working 40.000000 hours per week
2		Yuko		Nagara		111111111		Japan
3		Lianne		Acilles		333333333		USA
4		Odie		Achilles

 */
