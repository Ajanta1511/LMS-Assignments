package emppack;

//is-A Relationship with Employee
public class Manager  extends Employee{
	private String deptName;
	private int empCount;
	
	// Constructor chaining  super()
	public Manager(int empId, String empName, int bSal, String deptName,
			int empCount) {
		super(empId, empName, bSal);
		this.deptName = deptName;
		this.empCount = empCount;
		
	}
	public String getDetails()
	{
		return (super.getDetails()+"  "+deptName+"  "+empCount);
	}
	


	public String getDeptName() {
		return deptName;
	}

	public int getEmpCount() {
		return empCount;
	}

	@Override
	public double calcNetSal() {
		 return NetSal = bSal + (bSal*20/100) + (bSal*95/100) + 3000;
		
	}
	
	public double taxPay() {
		return TaxVal = (bSal*25/100);
		
	}
	
	
	
	
	
	

}
