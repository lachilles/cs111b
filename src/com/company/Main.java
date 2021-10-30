/* Programming Exercise for Chapters 4-6: Days Out, for CS 111B
   Written by Lianne Achilles
   Calculates the average number of days a company's employees are absent
*/
package com.company;
import java.util.Scanner;

public class Main
{
    static Scanner keyIn = new Scanner(System.in);

    public static void main(String args[])
    {
        int   employees,            // The number of employees
                daysAbsent;           // Total days misssed by all employees

        employees = getNumEmps();
        daysAbsent = getDaysMissed(employees);
        showAvgDaysMissed(employees, daysAbsent);
    } // End of main function

    //*******************************************************************
    // Function getNumEmps. This function asks the user to enter        *
    // the number of employees in the company. Validation is performed  *
    // to verify at least one employee, the value entered is            *
    // then returned to function main.                                  *
    //*******************************************************************
    static int getNumEmps()
    {
        Scanner scan = new Scanner (System.in);
        int employees;

        System.out.print("How many employees are there in the company? ");
        employees = scan.nextInt();
        if (employees > 0)
        {
            return employees;
        }
        else
        {
            System.out.println("The number of employees must be one or greater. Please re-enter:");
        }

        return employees;
    } // End of function getNumEmps

    //*******************************************************************
    // Function daysMissed. Accepts as an argument the number of        *
    // employees in the company. User is asked to enter the             *
    // number of days missed by each employee. Validation performed to  *
    // confirm negative number is not entered. The total days missed    *
    // by all employees is returned.                                    *
    //*******************************************************************

    public static int getDaysMissed(int employees)
    {
        int days_missed, emp_no=1;
        int total_days_missed = 0;

        Scanner scan = new Scanner (System.in);

        do {
            System.out.printf("Days missed by employee # %d : ", emp_no);
            days_missed = scan.nextInt();
            for(emp_no=1; emp_no<=employees; emp_no++)
                total_days_missed += days_missed;
        }while(emp_no<=employees);

        return total_days_missed;
    }

    //*******************************************************************
    // Function showAvgDaysMissed. Takes two arguments: the number of
    // employees in the company and the total number of days absent for
    // all employees during the year. Prints the average number of days
    // missed per employee.

    public static void showAvgDaysMissed(int employees, int daysAbsent) {
        double avg_days_missed;
        avg_days_missed = (double) daysAbsent / employees;
        System.out.printf("The average number of days missed per employee is %.1f ", avg_days_missed);
    }
} // End of class Main
