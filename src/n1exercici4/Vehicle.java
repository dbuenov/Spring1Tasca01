package n1exercici4;

public class Vehicle {
	
	/*
	
	El n�mero de comandaments es constant per tots els Vehicles
	L'any de fabricaci� �s constant per cada instancia de la clase Vehicle
	Quan canvia la normativa, canvia per tots els Vehicles
	
	*/
		
	public static final int comandament=1;
	public final int anyFabricacio;
	public static String normativa;
	
	
	public Vehicle(int anyFabricacio, String normativa) {
		this.anyFabricacio = anyFabricacio;
		Vehicle.normativa = normativa;
		System.out.println("Vehicle constru�t l'any "+this.anyFabricacio+", amb "+Vehicle.comandament+" comandament i sota la normativa "+Vehicle.normativa);
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
