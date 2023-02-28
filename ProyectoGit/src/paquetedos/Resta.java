package paquetedos;

public class Resta {

	private static int num1 = 5;
	private static int num2 = 3;
	
	public int resta(int num1, int num2) {
		return num1 - num2;
	}

	public static void main(String[] args) {

		Resta resta1 = new Resta();
		
		System.out.println(resta1.resta(num1, num2));
			
		
		
	}

}
