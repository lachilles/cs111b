/* Phone test file for Assignment 7
   CS 111B - Written by Lianne Achilles
   This main function tests the Phone class
   which you are supposed to write.
   When this file is included in a project with
   a correct Phone class, it should produce
   the output shown below.

   DO NOT CHANGE THIS FILE
*/

class Main
{
    public static void main(String[] args)
    {
        Phone craigPhone, bettoPhone, tobyPhone;

        craigPhone = new Phone("Samsung", "Galaxy S21 5G", "Phantom Violet", 256);
        bettoPhone = new Phone("Apple", "iPhone 13 Pro", "Graphite", 512);
        tobyPhone = new Phone("Apple", "iPhone 13 Pro", "Graphite", 512);

        System.out.println("The brightest color here is: " + craigPhone.getColor());

        if(craigPhone.getCapacity() < bettoPhone.getCapacity())
        {
            System.out.println("This phone:");
            System.out.println(craigPhone);
            System.out.println("has lower capacity than the:");
            System.out.println(bettoPhone);
        }
        else
        {
            System.out.println("Error! This phone:");
            System.out.println(craigPhone);
            System.out.println("should have lower capacity than the:");
            System.out.println(bettoPhone);
        }

        if(bettoPhone.equals(tobyPhone))
        {
            System.out.println("We have two of these:");
            System.out.println(bettoPhone);
        }
        else
        {
            System.out.println("Error! This phone:");
            System.out.println(tobyPhone);
            System.out.println("should be equal to:");
            System.out.println(bettoPhone);
        }

        tobyPhone.setCapacity(1000);   // upgrade to 1TB
        if(bettoPhone.equals(tobyPhone))
        {
            System.out.println("Error! After upgrade, this phone:");
            System.out.println(tobyPhone);
            System.out.println("should have more capacity than:");
            System.out.println(bettoPhone);
        }
        else
        {
            System.out.println("After upgrade they aren't equal, because this phone:");
            System.out.println(tobyPhone);
            System.out.println("has more capacity than:");
            System.out.println(bettoPhone);
        }
    }
}
