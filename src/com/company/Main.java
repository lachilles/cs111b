/* Lianne Achilles
 Muni ridership calculator
 CS111B
 This program takes survey data inputs about Muni riders, and outputs a summary of that data.
*/
package com.company;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        String muniLine;
        int daysSurveyed, numRiders;
        double avgRiders;

        Scanner inputReader = new Scanner(System.in); // instantiate a new Scanner object for input

        System.out.print("Welcome to the Muni Ridership Calculator. \n");
        System.out.print("Which Muni line did you survey? ");
        muniLine = inputReader.nextLine();
        System.out.print("How many days did you survey ridership? ");
        daysSurveyed = scan.nextInt();
        System.out.print("How many riders did you count? ");
        numRiders = scan.nextInt();

        avgRiders = (double)numRiders / daysSurveyed;
        // The above "(double)" type cast is needed to get an accurate answer (not always an integer)

        System.out.printf("According to your survey, an average of %,.2f people \n rode the %s " +
                "per" +
                " day.", avgRiders, muniLine);
    }
}
/* /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA 2.app/Contents/lib/idea_rt.jar=53276:/Applications/IntelliJ IDEA 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/lianneachilles/Code/cs111b/out/production/cs111b com.company.Main
Welcome to the Muni Ridership Calculator.
Which Muni line did you survey? J-Church
How many days did you survey ridership? 5
How many riders did you count? 23456
According to your survey, an average of 4,691.20 people
 rode the J-Church per day.
Process finished with exit code 0

/Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA 2.app/Contents/lib/idea_rt.jar=53299:/Applications/IntelliJ IDEA 2.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/lianneachilles/Code/cs111b/out/production/cs111b com.company.Main
Welcome to the Muni Ridership Calculator.
Which Muni line did you survey? N-Judah
How many days did you survey ridership? 5
How many riders did you count? 500
According to your survey, an average of 100.00 people
 rode the N-Judah per day.
Process finished with exit code 0

*/
