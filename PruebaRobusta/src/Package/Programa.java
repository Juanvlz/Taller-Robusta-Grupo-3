package Package;

public class Programa {

	public static void main(String[] args) {
		try {
			System.out.println("Hello World!");
		} catch (Exception ex) {
			try {
				System.out.println("Bye World!");
			} catch (Exception exc) {
				throw new RuntimeException(exc);			
			}
		}
	}

}
