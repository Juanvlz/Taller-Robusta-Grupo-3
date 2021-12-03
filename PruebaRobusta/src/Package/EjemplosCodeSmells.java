package Package;

public class EjemplosCodeSmells {
	
	//Ejemplo Empty catch block
	public static void main(String[] args) {
		try {
			int[] numeros = {1, 2, 3};
			System.out.println(numeros[10]);
		} catch (Exception e) {
			

		}

	}
}
