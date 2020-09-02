package Manager_Trainee;

public class Employee {
	protected long employeeId;
	protected String employeeName;
	protected String employeeAddress;
	protected long employeePhone;
	protected double basicSalary;
	protected final double specialAllowance = 250.80;
	protected final double Hra = 1000.50;
	
	public Employee(long id, String name, String address, long phone, double basicSalary) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = basicSalary;
	}
	
	//overloaded method
	public Employee(long id, String name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	public double calculateSalary(double basicSalary, double specialAllowance, double hra) {
		double salary = (basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100));
		return salary;
	}
	
	public void calculateTransportAllowance(double basicSalary) {
		double transportAllowance = basicSalary * 0.1;
		System.out.println(transportAllowance);
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public double getHra() {
		return Hra;
	}
	
}
