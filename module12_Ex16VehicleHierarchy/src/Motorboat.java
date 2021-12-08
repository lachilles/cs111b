/* Lianne Achilles Motorboat.java - CS 111B
   Example to show inheritance from abstract Vehicle

   This class represents a Motorboat with make and model
   (inherited from Vehicle) and a range.
   It inherits the public travel method from Vehicle.
*/

import javax.swing.*;

class Motorboat extends Vehicle
        implements LimitedRange
{
    // declare instance variables
    protected int maxRange; // How far can go with full gas tank
    protected int currentRange;  // How far on current gas

    // // constructor definitions:
    // use inherited constructor to store make and model
    // then store range
    public Motorboat(String make, String model, int range)
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
            System.out.println("Wisshhh!");
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
