package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Coffee coffee = new Coffee("coffee",2,"good coffee", true, false);
			Espresso espresso = new Espresso("espresso",3,"good espresso",false, true);
			Cappuccino cappuccino = new Cappuccino("cappuccino",4,"good cappuccino",false, false);
			
			System.out.println("How many do you want?");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			System.out.println(coffee.getName() +" " + coffee.getDescription()+ " "+coffee.calculateProductTotal(coffee.getPrice(), input) +" " +coffee.calculateTotal(coffee.calculateProductTotal(coffee.getPrice(), input))  );
			System.out.println(espresso.getName() +" " + espresso.getDescription()+ " "+espresso.calculateProductTotal(espresso.getPrice(), input) +" " +espresso.calculateTotal(espresso.calculateProductTotal(espresso.getPrice(), input)));
			System.out.println(cappuccino.getName() +" " + cappuccino.getDescription()+ " "+cappuccino.calculateProductTotal(cappuccino.getPrice(), input) +" " +cappuccino.calculateTotal(cappuccino.calculateProductTotal(cappuccino.getPrice(), input)));
			sc.close();
	}
}
