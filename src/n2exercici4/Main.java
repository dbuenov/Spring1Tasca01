package n2exercici4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Ratoli ratoli = new Ratoli();
		Jerbu jerbu = new Jerbu();
		Hamster hamster = new Hamster();
		
		ArrayList<Rossegador> rossegadors = new ArrayList<Rossegador>();
		
		rossegadors.add(ratoli);
		rossegadors.add(jerbu);
		rossegadors.add(hamster);

		//cada objecte invoca el mètode de la seva clase original
		for (Rossegador rossegador : rossegadors) {
			rossegador.correr();
			rossegador.ensumar();
			rossegador.rossegar();
		}
		
	}

}
