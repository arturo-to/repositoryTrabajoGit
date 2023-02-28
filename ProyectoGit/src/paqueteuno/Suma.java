package paqueteuno;

public class Suma {
	private static int num1 = 2;
	private static int num2 = 3;
	
	public int suma(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {

		Suma sumaAntonio = new Suma();
		
		System.out.println(sumaAntonio.suma(num1, num2));
			
		
		
	}

}
