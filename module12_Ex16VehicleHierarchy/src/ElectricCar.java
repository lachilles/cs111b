/* Lianne Achilles ElectricCar.java - CS 111B
   Example to show inheritance from abstract Vehicle

   This class represents a Electric Vehicle with make and model
   (inherited from Vehicle) and a range.
   It inherits the public travel method from Vehicle.
*/

import javax.swing.*;

class ElectricCar extends Vehicle
        implements LimitedRange
{
    // declare instance variables
    protected int maxRange;  // How far can go when fully charged
    protected int currentRange;  // How far can go with current charge

    // // constructor definitions:
    // use inherited constructor to store make and model
    // then store range
    public ElectricCar(String make, String model, int maxRange)
    {
        // call Vehicle constructor with parameters:
        super(make, model);
        this.maxRange = maxRange;
        currentRange = maxRange;
    }

    @Override
    public boolean travel(int distance)
    {
        if (currentRange >= distance)
        {
            currentRange -= distance;
            System.out.println("Zoom!");
            return true;
        }
        else
            return false;
    }

    // NEW: This getCurrentRange method is required by
    // the LimitedRange interface we are implementing.
    @Override
    public int getCurrentRange() {
        return currentRange;
    }
}
