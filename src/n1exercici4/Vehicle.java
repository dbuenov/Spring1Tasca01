package n1exercici4;

public class Vehicle {
	
	/*
	
	El número de comandaments es constant per tots els Vehicles
	L'any de fabricació és constant per cada instancia de la clase Vehicle
	Quan canvia la normativa, canvia per tots els Vehicles
	
	*/
		
	public static final int comandament=1;
	public final int anyFabricacio;
	public static String normativa;
	
	
	public Vehicle(int anyFabricacio, String normativa) {
		this.anyFabricacio = anyFabricacio;
		Vehicle.normativa = normativa;
		System.out.println("Vehicle construït l'any "+this.anyFabricacio+", amb "+Vehicle.comandament+" comandament i sota la normativa "+Vehicle.normativa);
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
