import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> collectionEmployee = new ArrayList<Employee>();
		
		Employee hourlyEmp = new HourlyEmployee("Pam Beesly", 5, 40, 10);
		Employee salaryEmp = new SalaryEmployee("Angela Martin", 10, 4500);
		Employee commissionEmp = new CommissionEmployee("Dwight K. Shrute", 11, 2000, 0.1, 40000); 
		Employee seniorSalaryEmp = new SeniorSalaryEmployee("Todd Packer", 18, 50000);
		
		collectionEmployee.add(hourlyEmp); 
		collectionEmployee.add(salaryEmp); 
		collectionEmployee.add(commissionEmp); 
		collectionEmployee.add(seniorSalaryEmp); 
		
		Employee supervisorEmp = new SupervisorEmployee("Michael L. Scott", 0, collectionEmployee, 0.2);
		
		System.out.println(hourlyEmp);
		System.out.println(salaryEmp);
		System.out.println(commissionEmp);
		System.out.println(seniorSalaryEmp);
		System.out.println(supervisorEmp);

	}
	
}
