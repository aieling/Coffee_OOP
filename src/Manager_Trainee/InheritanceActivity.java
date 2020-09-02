package Manager_Trainee;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee manager = new Manager(126534,"peter","chennai india",237844,65000);
		double salary = manager.calculateSalary(manager.getBasicSalary(), 
												manager.getSpecialAllowance(), 
												manager.getHra());
		System.out.println(salary);
		
		Trainee trainee = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		double salaryTrainee = trainee.calculateSalary(trainee.getBasicSalary(), 
				trainee.getSpecialAllowance(), 
				trainee.getHra());
		System.out.println(salaryTrainee);
		
		manager.calculateTransportAllowance(manager.getBasicSalary());

		trainee.calculateTransportAllowance(trainee.getBasicSalary());
		
	}

}
