package newbornbaby;


public class Baby {
	double weight;
	public void isHealthy() {
		if(2.5<weight && weight<5) {
			System.out.println("Your baby is in healthy weight range");
		}
		else if(weight<2.5) {
			System.out.println("Your baby is underweight");
		}
		else if(weight>5) {
			System.out.println("Your baby is overweight");
		}
			
		
	}

}