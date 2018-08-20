class Machine {
	private String name;
	private int version;
	
	public Machine() {
		this("Glen", 0);
		System.out.println("Constructor 1 running!");
		
		this.name = "Arnie";
	}
	
	public Machine(String name) {
		System.out.println("Constructor 2 running!");
		
		this.name = name;
	}
	
	public Machine(String name, int version){
		System.out.println("Constructor 3 running!");
		
		this.name = name;
		this.version = version;
	}
	
	public String getName() {
		return name;
	}
	public int getVersion() {
		return version;
	}
	
}

public class App {

	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		//Machine machine2 = new Machine("Tomte");
		Machine machine3 = new Machine("Far", 3);
		
		System.out.println(machine1.getName());
		//System.out.println(machine2.getName());
		System.out.println(machine3.getName() + " Machine Version: " + machine3.getVersion());
		
	}

}
