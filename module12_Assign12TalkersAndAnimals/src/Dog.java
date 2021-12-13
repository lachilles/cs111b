/* Lianne Achilles Dog.java - CS 111B
   Example to show inheritance from abstract Animal

   This class represents a Dog with a name (inherited from Animal) and a range.
   It inherits the public getName method from Animal and implements speak method from Talker.
*/

class Dog extends Animal
        implements Talker
{
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Fido");
    }

    @Override
    public void speak()
    {
        System.out.println("Woof!");
    }
}
