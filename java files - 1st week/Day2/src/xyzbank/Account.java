package xyzbank;

public class Account {
	private double balance;
	
	//Set the balance to 0.00
	public Account() {
		balance = 0.0;
	}
	//Deposit amt
	public void deposit(double amt) {
		balance = balance + amt;
	}
	//Withdraw amt
	public void withdraw(double amt) {
		if(amt<=balance) {
			balance = balance - amt;
		}
		else {
				System.err.println("Transaction cancelled due to insufficiant funds");
			}
	//balance = balance - amt;
	}
	
	//Get Balance
	public double getBalance() {
		return balance;
	}

}
