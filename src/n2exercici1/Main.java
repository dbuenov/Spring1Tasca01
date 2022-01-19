package n2exercici1;

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
			
		//no puc invocar aquest mètode, ja que no hi es a la clase mare
		//c.metodeRide();
		
	}

}
