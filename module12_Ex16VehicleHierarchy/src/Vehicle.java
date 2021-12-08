/* Vehicle abstract class, part of Vehicle Hierarchy
   Starter code for Exercise for Chapter 16 in CS 111B
   by Craig Persiko

   DO NOT CHANGE THIS FILE
*/

abstract class Vehicle
{
    protected String make;
    protected String model;

    // To instantiate a new Vehicle object, you have
    // to specify its make and model.
    public Vehicle(String make, String model)
    {
        this.make = make;
        this.model = model;
    }

    // If the vehicle can travel the distance,
    // do so and return true.  If not, return false.
    abstract boolean travel(int distance);
}
