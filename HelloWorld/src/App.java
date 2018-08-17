class Frog {
	//make sure that you cannot access the data outside the class
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class App {


	public static void main(String[] args) {
		
		Frog prince = new Frog();
		prince.setAge(4);
		prince.setName("Albert");
		
		System.out.println(prince.getName());
		System.out.println(prince.getAge());
		
	}

}
