package javaby;

public class bike {

	public static void main(String[] args) {
		
		bikeRunner Ducati = new bikeRunner();
		bikeRunner Honda = new bikeRunner();
		
		Ducati.start();
		Honda.start();
		
		Ducati.speed = 100;
		Honda.speed = 20;
		
		System.out.println(Ducati.speed);
		System.out.println(Honda.speed);

	}

}
