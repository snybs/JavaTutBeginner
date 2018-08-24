class Machine {
	public void start() {
		System.out.println("Machine started");
	}
}

class Camera extends Machine {
	
	@Override
	public void start() {
		System.out.println("Camera started");
	}
	
	public void snap() {
		System.out.println("Picture taken");
	}
}

public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine();
		
		Camera hiddenCam = new Camera();
		
		mach1.start();
		
		hiddenCam.start();
		hiddenCam.snap();
		
		//Upcasting (safe, you have only 1 parent
		Machine mach2 = hiddenCam;
		mach2.start();
		
		//Downcasting (unsafe, you may have several children)
		Machine mach3 = new Camera();
		Camera camera2 = (Camera)mach3;
		camera2.snap();
		
		
		//Doesnt work --- runtime error
		Machine mach4 = new Machine();
		//Camera camera3 = (Camera)mach4;
		//camera3.start();
		//camera3.snap();

	}

}
