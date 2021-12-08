/* Lianne Achilles ElectricCar.java - CS 111B
   Example to show inheritance from abstract Vehicle

   This class represents a Sailboat with make and model
   (inherited from Vehicle).
   It inherits the public travel method from Vehicle.
*/

import javax.swing.*;

class Sailboat extends Vehicle
{
    // declare instance variables

    // // constructor definitions:
    // use inherited constructor to store make and model
    // then store range
    public Sailboat(String make, String model)
    {
        // call Vehicle constructor with parameters:
        super(make, model);
    }

    @Override
    public boolean travel(int distance)
    {
        System.out.println("Weee!\n");
        return true;
    }
}
