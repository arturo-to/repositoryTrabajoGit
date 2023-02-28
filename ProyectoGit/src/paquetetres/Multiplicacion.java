package paquetetres;

import paqueteuno.Suma;

public class Multiplicacion {
	
	private static int num1 = 5;
	private static int num2 = 3;
	
	public int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static void main(String[] args) {
		System.out.println("He fusionado las ramas");
		Multiplicacion multiplicacion = new Multiplicacion();
		
		System.out.println(multiplicacion.multiplicar(num1, num2));

	}

}
