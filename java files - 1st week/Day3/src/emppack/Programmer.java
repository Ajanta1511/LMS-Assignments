package emppack;

public class Programmer extends Employee{
	private int noOfProjects;
	private String skillset;
	
	
	
	public Programmer(int empId, String empName, int bSal, int noOfProjects,
			String skillset) {
		super(empId, empName, bSal);
		this.noOfProjects = noOfProjects;
		this.skillset = skillset;
	}
	
	
	

	public String getDetails()
	{
		return super.getDetails()+"  "+noOfProjects+"   "+skillset;
	}

	
	public double calcNetSal() {
		 return NetSal = bSal + (bSal*20/100) + (bSal*95/100) + 3000;
		
	}
	
	public double taxPay() {
		return TaxVal = bSal*25/100;
		
	}
}
