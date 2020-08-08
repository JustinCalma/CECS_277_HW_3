
public class CommissionEmployee extends Employee {
	private double baseSalary;
	private double totAmntMonthlySales;
	private double commissionPercentage; // (Percentage of sales that converts to wages)
	
	public CommissionEmployee(String name, int tenure, double baseSalary, double commissionPercentage, double totAmntMonthlySales) {
		super(name, tenure);
		this.baseSalary = baseSalary;
		this.commissionPercentage = commissionPercentage;
		this.totAmntMonthlySales = totAmntMonthlySales;
	}
	
	public double getWages() {
		double product = 0;
		double sum = 0;
		
		product = this.totAmntMonthlySales * this.commissionPercentage;
		sum = this.baseSalary + product;

		return sum;
		
	}
	
	public String toString() {
		String strWage = String.format("%.2f", getWages());
		String strBaseSalary = String.format("%.2f", this.baseSalary);
		String strMonthlySales = String.format("%.2f", this.totAmntMonthlySales);
		return "I'm " + super.getName() + ", a Commission Employee. I have a base salary of: $" + strBaseSalary + ". I have a commission percentage of: " + (int)(this.commissionPercentage * 100) + "%." + 
				" The total amount of monthly sales is: $" + strMonthlySales + ". I made $" + strWage + "!";
	}

}
