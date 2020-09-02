
public class CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Multiplier();
		calc.add(1, 2);
		
		Multiplier mult = new Multiplier();
		mult.multiply(2, 2);
		
		NewMultiplier newMult = new NewMultiplier();
		mult.multiply(4, 5);
		newMult.multiply(4, 5);
		 
		
	}

}
