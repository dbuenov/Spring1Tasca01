package n1exercici2;

public class Vehicle {
	public Vehicle() {
		System.out.println("Constructor de la clase Vehicle");
	}
	
	public void iniciar() {
		System.out.println("M�tode iniciar de la clase Vehicle");
	}
	
	public static void parar() {
		System.out.println("M�tode static parar de la clase Vehicle");
	}
	
	public void accelerar() {
		System.out.println("M�tode NO static accelerar de la clase Vehicle");
	}	
}
