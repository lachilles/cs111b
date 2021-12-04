/* Lianne Achilles  -  Circle.java
   CS111B Assignment 10
   Defines a class to store data on a Circle,
   which is a kind of Shape.
*/

class Circle extends Shape
{
    protected double radius;

    // default constructor:
    // use inherited constructor to assign an id
    public Circle()
    {
        // super() is automatically called.
        radius = 0;
    }

    // constructor to set all values (unique id automatically assigned)
    public Circle(double r)
    {
        radius = r;
    }

    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter()
    {
        return 2 * Math.PI * radius;
    }
}

/* Output:

This program examines the ratio of area to perimeter
for a few different shapes.
(The larger the ratio, the greater the efficiency of space contained)
Shape #1 is a 10 unit radius Circle with ratio 5.0
Shape #2 is a 15x25 Rectangle with ratio 4.6875
Shape #3 is a 20 unit Square with ratio 5.0
Shape #4 is a 2 unit radius Circle with ratio 1.0

*/
