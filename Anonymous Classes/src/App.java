class Machine {
	public void start() {
		System.out.println("Starting machine");
	}
}

interface Plant {
	public void grow();
}

public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine() {
			@Override public void start() {
				System.out.println("Camera taking photos!");
			}
		};
		
		mach1.start();
		
		Plant plant1 = new Plant() {
			@Override public void grow() {
				System.out.println("Growing");
			}
		};
		
		plant1.grow();

	}

}
