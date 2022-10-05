package com.soprasteria;

import java.util.Scanner;

public class Main {
	
 public static void main(String[] args ) {
	Scanner in = new Scanner(System.in);
	int eta;
	System.out.print(" quanti anni hai? ");
	eta = in.nextInt();
	if (eta < 7) {
		System.out.print(" il biglietto è gratis ");
	}else if (eta > 7 && eta < 15){
		System.out.print(" il biglietto costa 6 euro ");
	}if (eta >= 15) {
		System.out.print(" il biglietto costa 10 euro ");
	}
	
	}
	
}


