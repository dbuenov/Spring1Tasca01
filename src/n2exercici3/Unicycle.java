package n2exercici3;

public class Unicycle extends Cycle{
	public Unicycle() {
		this.setRodes(1);
	}
	
	public void metodeRide() {
		System.out.println("El monocicle roda");
	}
	
	public void balance() {
		System.out.println("Balance de Unicyle");
	}
}
