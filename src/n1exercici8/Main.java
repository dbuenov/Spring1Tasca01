package n1exercici8;

public class Main {

	public static void main(String[] args) {
		
		Frog granota = new Frog();
				
		granota.menjar();
		granota.moure();
		granota.respirar();
		granota.saltar();
		
		//generalitzo i crido tots els mètodes
		
		((Amphibian)granota).menjar();
		((Amphibian)granota).moure();
		((Amphibian)granota).respirar();
		
		//Tots menys aquest els puc cridar, i s'executa el de la clase filla
		//((Amphibian)granota).saltar();
		
		
	}

}
