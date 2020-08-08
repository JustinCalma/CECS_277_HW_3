
public class SeniorSalaryEmployee extends SalaryEmployee {
	
	public SeniorSalaryEmployee(String name, int tenure, double yearlySalary) {
		super(name, tenure, yearlySalary);
	}
	
	public double getWages() {
		double salary = 0;
		double yearlySalary = super.getWages();
		double nthPow = super.getTenure() - 10;
		
		salary = yearlySalary * Math.pow(1.03, nthPow);

		return salary;
		
	}
	
	public String toString() {
		String strWage = String.format("%.2f", getWages());
		String strBaseSalary = String.format("%.2f", super.getWages());
		return "I'm " + super.getName() + ", a Senior Salary Employee. I have a base salary of: $" + strBaseSalary + " I have a tenure of: " + super.getTenure()  
		 + " years. I made $" + strWage + "!";
	}

}
