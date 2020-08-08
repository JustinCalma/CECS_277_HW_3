
abstract class Employee {
	private String name;
	private int tenure;
	
	public Employee(String name, int tenure) {
		this.name = name;
		this.tenure = tenure;
	}
	
	public abstract double getWages();
	
	public String toString() {
		return "I'm an employee, whee! ";
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getTenure() {
		return this.tenure;
	}
	
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
}
