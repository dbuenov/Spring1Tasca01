package n2exercici3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Unicycle unicycle = new Unicycle(); 
		Bicycle bicycle = new Bicycle();
		Tricycle tricycle = new Tricycle();
		
		ArrayList<Cycle> cycles= new ArrayList<Cycle>();
		
		cycles.add(unicycle);
		cycles.add(bicycle);
		cycles.add(tricycle);
		
		for (Cycle cycle : cycles) {
			if (cycle instanceof Unicycle) {
				((Unicycle) cycle).balance();
			}else if (cycle instanceof Bicycle){
				((Bicycle) cycle).balance();
			}else if (cycle instanceof Tricycle){
				//((Tricycle) cycle).balance();
				System.out.println("Soc un tricicle i no tinc balance()");
			}
		}		
		
	}
}
