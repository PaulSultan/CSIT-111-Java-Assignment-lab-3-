import java.util.Random;

public class Account {
    private double balance;
    private String name;
    private long acctNum;
    private static int numAccounts;
    Random generator = new Random();


    // Constructor -- initializes balance, owner, and account number
    
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
        numAccounts ++;
    }
    
    public Account (double initBal, String owner) {
        balance = initBal;
        name = owner;
        acctNum = Math.abs(generator.nextLong());
        numAccounts ++;
    }
    
    public Account (String owner) {
        name = owner;
        balance = 0;
        acctNum = Math.abs(generator.nextLong());
        numAccounts ++;
    }

    
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
   
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }
    
    public void withdraw(double amount, int servicefee) {
        if (balance >= amount + servicefee)
            balance -= amount + servicefee;
        else
            System.out.println("Insufficient funds");
    }

    
    // Adds deposit amount to balance.
  

    public void deposit(double amount) {
        balance += amount;
    }

    // Returns balance for the accounts
    public double getBalance() {
        return balance;
    }
    
    public static int getNumAccounts() {
        return numAccounts;
    }
    
    public void close() {
        name = name + "(CLOSED)";
        balance = 0;
        numAccounts --;
    }
    
    public Account Consolidate(Account acct1, Account acct2) {
        
        if (acct1.name.equalsIgnoreCase(acct2.name) && acct1.acctNum != acct2.acctNum) {
            Account newAccount = new Account(0, acct1.name);
            newAccount.balance = acct1.getBalance() + acct2.getBalance();
            acctNum = Math.abs(generator.nextLong());
            
            acct1.close();
            acct2.close();
            
            return newAccount;
            
        } else {
            System.out.println("Sorry, you can't consolidate these 2 accounts. " +
            		"Please check the ownerships or the account numbers.");
            
            return null;
        }
        
        
    }

    // Returns a string containing the name, account number, and balance.
    public String toString() {
        return "Name:" + name + "\nAccount Number: " + acctNum + "\nBalance: "
                + balance;
    }
}