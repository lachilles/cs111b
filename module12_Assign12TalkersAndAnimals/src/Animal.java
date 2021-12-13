/* Animal abstract class
*/

abstract class Animal
{
    protected String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}


/* Sample output from Main class

What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: d
What is your dog's name? Odie
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: d
What is your dog's name?
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: d
What is your dog's name? Saffie
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: c
What is your cat's name? Brownie
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: r
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: f
What is your fish's name?
Do you want to enter another? Type y or n: n
Hello Odie
Hello Fido
Hello Saffie
Hello Brownie
Hello
Woof!

Woof!

Woof!

Meow!

blahblahblah

 */
