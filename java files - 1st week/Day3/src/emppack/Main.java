package emppack;

public class Main {

	public static void main(String[] args) {
		Programmer pr1 = new Programmer(101,"Manisha",60000,4,"Java,Python");
		System.out.println(pr1.getDetails());
		System.out.println(pr1.calcNetSal());
		System.out.println(pr1.taxPay());
	
		Manager m1 = new Manager(201, "Meghana", 100000, "SE",10 );
		System.out.println(m1.getDetails());
		System.out.println(m1.calcNetSal());
		System.out.println(m1.taxPay());
		
	

	}

}
