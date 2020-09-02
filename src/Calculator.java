
public class Calculator {

	private final String ADD = "+";
	private final String SUBSTRACT = "-";
	
	public void display(int a, int b, String modifier, int c) {
		System.out.println(a + modifier + b + "=" + c);
	}
	
	public void add(int a, int b) {
		int result = a+b;
		display(a,b,ADD,result);
	}
	
	public void substract(int a, int b) {
		int result = a - b;
		display(a,b,SUBSTRACT, result);
	}
	

}
