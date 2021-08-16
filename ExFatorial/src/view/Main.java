package view;

import controller.FatorialController;

public class Main {
	public static void main(String[] args) {
		
		FatorialController fat = new FatorialController();
		
		int fatorial = 5;
		
		fatorial = fat.fatorial(5, 5);
		System.out.println(fatorial);
	}
}
