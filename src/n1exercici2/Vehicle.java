package n1exercici2;

public class Vehicle {
	public Vehicle() {
		System.out.println("Constructor de la clase Vehicle");
	}
	
	public void iniciar() {
		System.out.println("Mètode iniciar de la clase Vehicle");
	}
	
	public static void parar() {
		System.out.println("Mètode static parar de la clase Vehicle");
	}
	
	public void accelerar() {
		System.out.println("Mètode NO static accelerar de la clase Vehicle");
	}	
}
