package n1exercici3;

public class ClaseA {
	
	public static int variableStatic = 0;
	
	public ClaseA() {		
		System.out.println("Constructor de la ClaseA");
	}
	
	{
		System.out.println("Inicialitzador d'instancia de la ClaseA");
	}
	
	static {
		System.out.println("Inicialitzador static de la ClaseA");
	}
	
	public static void metodeStatic () {
		System.out.println("Mètode static de la ClaseA");
	}	
}
