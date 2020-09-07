package bank.pakt1;

public class Account {
	
	private double balance;

	public Account() {
		balance=0;
	}

	
	public Account(double balance) {
		this.balance = balance;
	}


	public void deposit(double amt)
	{
		balance = balance + amt;
	}
	
	public void withdraw(double amt)
	{
		if(balance>=amt)
		{
			balance=balance-amt;
		}
		else
		{
			System.out.println("Not enough balance to withdraw!");
		}
	}
	
	public double balance() {
		return balance;
	}
	
	

}
