/* BankAccount class for Exercise for Final Exam Review in CS 111B, Craig Persiko
   Represents a bank account.
   It implements Comparable<BankAccount> (so compareTo is available in the standard way)
   and extends Record (so it has a record number).

   DO NOT CHANGE THIS FILE.
*/

class BankAccount extends Record implements Comparable<BankAccount>
{
    protected double balance;
    private String ownerName;

    public BankAccount(double bal, String owner)
    {
        balance = bal;
        ownerName = owner;
    }

    public void deposit(double dep)
    {
        balance += dep;
    }

    @Override
    public String toString()
    {
        return ownerName + " has $" + balance + " in account number " + getId();
    }

    @Override
    public int compareTo(BankAccount other)
    {
        if (balance > other.balance)
            return 1;
        else if (balance < other.balance)
            return -1;
        else
            return 0;
    }
}
