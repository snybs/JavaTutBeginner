//If overriding Methods in Eclipse, rightlick ->source->override/implement methods.


public class Car extends Machine {
	
	@Override
	public void start() {
		System.out.println("Car started!");
		//super.start();
	}

	@Override
	public void stop() {
		System.out.println("Car stopped!");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield");
	}

}
