package n1exercici2;

public class Main {

	public static void main(String[] args) {
		
		//per cridar el mètode parar no cal instanciar cap objecte de la clase Vehicle
		Vehicle.parar();
		
		//per cridar el mètode accelerar hem d'instanciar un objecte de la clase Vehicle
		Vehicle vehicle = new Vehicle();
		vehicle.accelerar();
	}
}
