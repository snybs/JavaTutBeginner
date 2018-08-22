class Frog {
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		/*
		StringBuilder sb = new StringBuilder();
		sb.append("Id: ").append(id).append(" Name: ").append(name);
		return sb.toString();
		*/
		
		return String.format("Id: %-2d %s", id, name);
	}
	
}


public class App {

	public static void main(String[] args) {
		
		Frog frog1 = new Frog(0, "Bert");
		
		System.out.println(frog1);

	}

}
