package xyzbank;

public class Main {

	public static void main(String[] args) {
		Account cust1 = new Account(); //opening a new account for customer 1
		cust1.deposit(300);
		cust1.withdraw(500);
		
		Account cust2 = new Account(); //opening a new account for customer 2
		cust2.deposit(700);
		System.out.println("Dear Customer1, you account balance is ");
		System.out.println(cust1.getBalance());
		
		System.out.println("Dear Customer2, you account balance is ");
		System.out.println(cust2.getBalance());
		
		

	}

}
