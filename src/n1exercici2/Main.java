package n1exercici2;

public class Main {

	public static void main(String[] args) {
		
		//per cridar el m�tode parar no cal instanciar cap objecte de la clase Vehicle
		Vehicle.parar();
		
		//per cridar el m�tode accelerar hem d'instanciar un objecte de la clase Vehicle
		Vehicle vehicle = new Vehicle();
		vehicle.accelerar();
	}
}
