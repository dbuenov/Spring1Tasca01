package n1exercici4;

public class Main {

	public static void main(String[] args) {
						
		//dos vehicles construïts en anys diferents amb la llei que toca aquell any		
		Vehicle cotxe = new Vehicle(2021, "Llei 2021");
		Vehicle moto = new Vehicle(2022, "Llei 2022");
		
		//per demostrar com funciona una variable static ho farè cridant-la des de les instancies		
		System.out.println();
		System.out.println("Canvi de normativa");
		Vehicle.normativa = "Llei 2023";
		System.out.println("A aquest vehicle li afecta la normativa de la "+cotxe.normativa);
		System.out.println("A aquest vehicle li afecta la normativa de la "+moto.normativa);
		System.out.println("Tots els vehicles estan sota la normativa de la "+Vehicle.normativa);
		
		System.out.println();
		System.out.println("Canvi de normativa");
		Vehicle.normativa = "Llei 2024";
		System.out.println("A aquest vehicle li afecta la normativa de la "+cotxe.normativa);
		System.out.println("A aquest vehicle li afecta la normativa de la "+moto.normativa);
		System.out.println("Tots els vehicles estan sota la normativa de la "+Vehicle.normativa);
		
	}
}
