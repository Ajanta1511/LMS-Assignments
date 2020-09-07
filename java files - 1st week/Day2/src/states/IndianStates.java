package states;

public class IndianStates {
	String state;
	public void visitState() {
		switch(state)
		{
			case "Telangana":
				System.out.println("Land in capital city Hyderabad, from there make use of Telangana Tourism buses to reach Warangal and Karimnagar");
			case "Karnataka":
				System.out.println("Land in capital city Bangalore, rent a car and visit Coorg and Mysore");
			default:
				break;
		}
		
	}

}
