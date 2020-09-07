package bank.pakt1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.deposit(10000);
		System.out.println(a1.balance());
		a1.withdraw(11000);

	}

}
