package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Product coffee = new Product("coffee",2,"good coffee");
			Product espresso = new Product("espresso",3,"good espresso");
			Product cappuccino = new Product("cappuccino",4,"good cappuccino");
			
			System.out.println("How many do you want?");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			System.out.println(coffee.getName() +" " + coffee.getDescription()+ " "+coffee.calculateProductTotal(coffee.getPrice(), input) +" " +coffee.calculateTotal(coffee.calculateProductTotal(coffee.getPrice(), input))  );
			System.out.println(espresso.getName() +" " + espresso.getDescription()+ " "+espresso.calculateProductTotal(espresso.getPrice(), input) +" " +espresso.calculateTotal(espresso.calculateProductTotal(espresso.getPrice(), input)));
			System.out.println(cappuccino.getName() +" " + cappuccino.getDescription()+ " "+cappuccino.calculateProductTotal(cappuccino.getPrice(), input) +" " +cappuccino.calculateTotal(cappuccino.calculateProductTotal(cappuccino.getPrice(), input)));
			sc.close();
	}
}
