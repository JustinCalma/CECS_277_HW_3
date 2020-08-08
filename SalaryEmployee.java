
public class SalaryEmployee extends Employee {
	private double monthlySalary;
	
	public SalaryEmployee(String name, int tenure, double monthlySalary) {
		super(name, tenure);
		this.monthlySalary = monthlySalary;
	}
	
	public double getWages() {
		return this.monthlySalary;
	}
	
	public String toString() {
		String strWage = String.format("%.2f", getWages());
		String strMonthlySalary = String.format("%.2f", this.monthlySalary);
		return "I'm " + super.getName() + ", a Salary Employee. I have a monthly salary of $" + strMonthlySalary + ". I made $" + strWage + "!";
	}
	
}
