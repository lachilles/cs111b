/* Craig Persiko - Shape.java - CS 111B
   Part of the starter code for Assignment 10
   Complete solution includes the classes
   Circle, Rectangle, and Square.

   This class represents an arbitrary shape with an ID number.
   This would actually be better as an Abstract Class, but
   we haven't studied those yet. So for now, this will work.

   DO NOT CHANGE THIS FILE
*/
class Shape
{
    private int id;
    static private int nextId = 1;

    public int getId()
    {
        return id;
    }

    // This constructor is protected because we don't want
    // a generic Shape to be instantiated (must be a specific
    // type of shape, so Shape is like an abstract class.)
    protected Shape()
    {
        id = nextId;
        nextId++;
    }

    // This area method is just a placeholder so we can
    // override it in subclasses.  Would be better as
    // an abstract method, as we will learn later.
    public double area()
    {
        return 0;
        // we have to return a number, but really this
        // should never be used. It should be overrriden instead.
    }

    // This perimeter method is just a placeholder so we can
    // override it in subclasses.  Would be better as
    // an abstract method, as we will learn later.
    public double perimeter()
    {
        return 0;
        // we have to return a number, but really this
        // should never be used. It should be overrriden instead.
    }
}

