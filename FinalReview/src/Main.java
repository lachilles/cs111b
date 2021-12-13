/* Main class for Exercise for Final Exam Review in CS 111B, Craig Persiko
   This Main class tests the SavingsAccount class, which you need to write.
   Notice that SavingsAccount must be a subclass of BankAccount.
   When your SavingsAccount class is correct, then you should get
   the output shown at bottom.

   DO NOT CHANGE THIS FILE.
*/

class Main
{
    public static void main(String args[])
    {
        BankAccount a1 = new BankAccount(510, "Elvis");
        SavingsAccount a2 = new SavingsAccount(500, "Madonna");
        SavingsAccount a3 = new SavingsAccount(100, "Craig");
        BankAccount account3;

        SavingsAccount.setRate(0.025);  // all SavingsAccounts will earn 2.5% interest

        a2.compoundInterest();
        a3.compoundInterest();
        System.out.println("After accruing interest, here are accounts 1 and 2:");
        outputInOrder(a1, a2);

        account3 = a3;  // Testing a polymorphic reference:
        // SavingsAccount is a sublclass of BankAccount
        System.out.println("And here's account 3:");
        System.out.println(account3);
        account3.deposit(10);
        System.out.println("And account 3 after depositing $10:");
        System.out.println(account3);
    }

    private static void outputInOrder(Comparable o1, Comparable o2)
    {
        if(o1.compareTo(o2) > 0)
        {
            System.out.println(o2); // The println method calls an Object's
            System.out.println(o1); // toString() method to output it.
        }
        else
        {
            System.out.println(o1);
            System.out.println(o2);
        }
    }
}

/* The completed program should produce the following output:

After accruing interest, here are accounts 1 and 2:
Elvis has $510.0 in account number 1
Madonna has $512.5 in account number 2 earning 2.5% interest
And here's account 3:
Craig has $102.5 in account number 3 earning 2.5% interest
And account 3 after depositing $10:
Craig has $112.5 in account number 3 earning 2.5% interest

*/
