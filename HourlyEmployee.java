
public class HourlyEmployee extends Employee {
	private int hrsWorkedMonthly;
	private double hrlyRateofPay;
	
	public HourlyEmployee(String name, int tenure, int hrsWorkedMonthly, double hrlyRateofPay) {
		super(name, tenure);
		this.hrsWorkedMonthly = hrsWorkedMonthly;
		this.hrlyRateofPay = hrlyRateofPay;
		
	}
	
	public double getWages() {
		double product = 0;
		
		product = hrsWorkedMonthly * hrlyRateofPay;
		
		return product;
		
	}
	
	public String toString() {
		String strWage = String.format("%.2f", getWages());
		String strRateofPay = String.format("%.2f", this.hrlyRateofPay);
		return "I'm " + super.getName() + ", an Hourly Employee. I worked " + this.hrsWorkedMonthly + " hours at a rate of " + strRateofPay + " dollars per hour. " + "I made $" + strWage + "!";
	}

}
