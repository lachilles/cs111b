/* Exercise for Chapter 16 in CS 111B - Craig Persiko
   Main class to test Vehicle hierarchy with
   abstract class and interface. (Part of starter code.)

   Your job is to write ElectricCar.java, Motorboat.java,
   and Sailboat.java so that this program produces the
   sample output shown at bottom.

   DO NOT CHANGE THIS CODE
*/

class Main
{
    public static void main(String[] args)
    {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new ElectricCar("Tesla", "Model 3", 262);
        // 262 mile range
        vehicles[1] = new Motorboat("Starweld", "16 Fusion DC", 45);
        // 45 mile range
        vehicles[2] = new Sailboat("Gulf Marine", "Gulf 32");
        // sailboats have unlimited range

        for(Vehicle v : vehicles)
        {
            goDistanceTest(v, 20);
            goDistanceTest(v, 40);
            System.out.println();
        }
    }

    // Test v to see if it can go distance, and output results.
    static void goDistanceTest(Vehicle v, int distance)
    {
        System.out.print("Going " + distance + " miles: ");
        if (!v.travel(distance))
            System.out.println("Can't make it.");
        else if(v instanceof LimitedRange)
        {
            System.out.println("I can go " + ((LimitedRange)v).getCurrentRange() + " miles farther.");
        }
    }
}

/* Sample Output that you should get after you write
   ElectricCar.java, Motorboat.java, and Sailboat.java:

Going 20 miles: Zoom!
I can go 242 miles farther.
Going 40 miles: Zoom!
I can go 202 miles farther.

Going 20 miles: Wisshhh!
I can go 25 miles farther.
Going 40 miles: Can't make it.

Going 20 miles: Weee!
Going 40 miles: Weee!

*/
