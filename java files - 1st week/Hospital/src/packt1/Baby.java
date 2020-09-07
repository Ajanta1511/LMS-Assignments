package packt1;

public class Baby {
	
	static int id;
	private double weight;
	private double temp;
	int health;
	
	public Baby(double weight, double temp) {
		super();
		this.weight = weight;
		this.temp = temp;
	}
	
	private void calcHealth()
	{
		if(weight<3.5 || temp<36) {
			health=1;
			return;
		}
		
		else if(weight>4.5 || temp>38)
		{
			health =2;
			return;
		}
		
		else if((weight>3.5 && weight<4.5) && (temp>36 && temp<38))
		{
			health =3;
			return;
		}
	}
	
	public void HealCheck()
	{
		if(health==1) {
			System.out.println("Your baby is undernourished!");
		}
		
		else if(health==2) {
			System.out.println("You baby is overweight!");
		}
		else if(health==3) {
			System.out.println("Congrats on a healthy baby!");
		}
	}

}
