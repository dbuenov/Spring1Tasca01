package n2exercici2;

public class Main {

	public static void main(String[] args) {
		Unicycle unicycle = new Unicycle(); 
		Bicycle bicycle = new Bicycle();
		Tricycle tricycle = new Tricycle();
						
		unicycle.metodeRide();
		bicycle.metodeRide();
		tricycle.metodeRide();
				
		ride(unicycle);
		ride(bicycle);
		ride(tricycle);
		
	}
	
	public static void ride(Cycle c) {
		System.out.println(c.wheels());
		//c.metodeRide();
		
	}

}
