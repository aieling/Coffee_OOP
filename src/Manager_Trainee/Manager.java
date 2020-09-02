package Manager_Trainee;

public class Manager extends Employee{
	
	protected double basicSalary;
	
	public Manager(long id, String name, String address, long phone, double salary) {
		super(id, name, address,phone);
		this.basicSalary = salary;
	}
	

	public void calculateTransportAllowance(double basicSalary) {
		double transportAllowance = (15*basicSalary)/100;
		System.out.println(transportAllowance);
	}
	@Override
	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	

}
