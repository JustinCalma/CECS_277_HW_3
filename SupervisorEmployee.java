import java.util.*;

public class SupervisorEmployee extends Employee {
	private ArrayList<Employee> collectionEmployee;
	private double bonusPercentage; // (percentage to increase the highest-paid supervised employee's wages by to calculate the supervisor's pay)
	
	public SupervisorEmployee(String name, int tenure, ArrayList<Employee> collectionEmployee, double bonusPercentage) {
		super(name, tenure);
		this.collectionEmployee = collectionEmployee;
		this.bonusPercentage = bonusPercentage;
	}
	
	public double getWages() {
		double currWage = 0;
		double newWage = 0;
		
		for (Employee emp : collectionEmployee) {

			currWage = emp.getWages();
			
			if (currWage > newWage) {
				newWage = currWage;
			}
		}
		
		return newWage * (1 + bonusPercentage);
		
	}
	
	public String toString() {
		String strWage = String.format("%.2f", getWages());
		String strMaxWage = String.format("%.2f", getWages() / (1 + this.bonusPercentage));
		return "I'm " + super.getName() + ", a Supervisor Employee. I supervise " + this.collectionEmployee.size() + " employee(s). The max wage out of all of the supervised employees is: $" +
				strMaxWage + ". And the bonus percentage is: " + (int)(this.bonusPercentage * 100) + "%. I made $" + strWage + "!";
	}

}