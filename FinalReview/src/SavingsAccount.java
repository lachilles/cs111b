/* Lianne Achilles -  SavingsAccount.java
   Defines a class to store data on a Savings Account,
   which is a kind of Bank Account, which is a kind of Record.
*/

class SavingsAccount extends BankAccount
{
    private static double interestRate;

    // constructor to set all values
    public SavingsAccount(double balance, String owner) {
        super(balance, owner);
    }

    public static void setRate(double ir)
    {
        interestRate = ir;
    }


    public void compoundInterest()
    {
        balance = (balance * interestRate) + balance;
    }

    @Override
    public String toString()
    {
        return super.toString() + " earning " + (interestRate * 100) + "% interest";
    }
}

/* Sample output
After accruing interest, here are accounts 1 and 2:
Elvis has $510.0 in account number 1
Madonna has $512.5 in account number 2 earning 2.5% interest
And here's account 3:
Craig has $102.5 in account number 3 earning 2.5% interest
And account 3 after depositing $10:
Craig has $112.5 in account number 3 earning 2.5% interest
 */
