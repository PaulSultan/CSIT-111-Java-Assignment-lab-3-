import java.util.Random;

		public class Account1a
		{
	   private double balance;
	   private String name;
	   private long acctNum;
	   // Constructor -- initializes balance, owner, and account number
	  public Account1a(double initBal, String owner, long number)
	  		{
	         balance = initBal;
	                name = owner;
	             acctNum = number;
	  		}
	  		// retrieves the account number//
	 public Account1a(double initBal, String owner)
	      	{
	         balance = initBal;
	                name = owner;
	             acctNum = generateAccountNumber();
	        }

	  public Account1a(String owner)
	      	{
	         balance = 0;
	              name = owner;
	             acctNum = generateAccountNumber();
	        }
	// Checks to see if balance is sufficient for withdrawal.
	// If so, decrements balance by amount; if not, prints message.
	  public void withdraw(double amount)
	       {
	         if (balance >= amount)
	                 balance -= amount;
	                else
	                      System.out.println("Insufficient funds");
	       }

	    public void withdraw(double amount, double fee)
	    	{
	         double amountWithFee = amount + fee;

	                if (balance >= amountWithFee)
	                  balance -= amountWithFee;
	         else
	                      System.out.println("Insufficient funds");
	    	}

	  public void deposit(double amount)
	        {
	         balance += amount;
	        }
	  		// Retrieves the balance from the account//
	  public double getBalance()
	        {
	         return balance;
	        }
	// Returns a string containing the name, account number, and balance.
	  public String toString()
	  		{
	         return "Name:" + name +
	           "\nAccount Number: " + acctNum +
	          "\nBalance: " + balance;
	  		}

	        private long generateAccountNumber()
	        {
	         Random r = new Random(); 
	           
	          return 10000 + r.nextInt(89999);  
	       }
	}