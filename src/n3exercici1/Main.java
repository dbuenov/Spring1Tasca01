package n3exercici1;

public class Main {

	public static void main(String[] args) {
		
		Derivada derivada = new Derivada();
				
		((Base)derivada).metode1();
		//Al cridar al metode1 i cridar al mètode2, executa el especific de la subclase, ja que existeix
		
		//el que no puc fer des de la generalitzaciè es cridar un mètode que no existeix a la superclasse
		derivada.metode3();
		//((Base)derivada).metode3();

	}

}
