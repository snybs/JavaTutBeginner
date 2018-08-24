import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}
	
	public void start() {
		System.out.println("Machine started");
	}

}

class Camera extends Machine {
	
	public void snap() {
		System.out.println("Taking picture");
	}

}

public class App {

	public static void main(String[] args) {

		ArrayList<Machine> list1 = new ArrayList<>();

		list1.add(new Machine());
		list1.add(new Machine());

		ArrayList<Camera> list2 = new ArrayList<>();

		list2.add(new Camera());
		list2.add(new Camera());

		//showList(list1);
		
		showList(list2);
		showList2(list1);

	}
	
	//Using wildcard (unknown type) you have to use the parent of all objects (Object).

	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
			value.start();
		}
	}
	
	public static void showList2(ArrayList<? super Camera> list) {
		for (Object value : list) {
			System.out.println(value);
		}
	}

}
