package Manager_Trainee;

public class Trainee extends Employee{
	protected double basicSalary;
	
	public Trainee(long id, String name, String address, long phone, double salary) {
		super(id, name, address,phone);
		this.basicSalary = salary;
	}
	
	
	@Override
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
}
