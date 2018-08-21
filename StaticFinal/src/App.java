class Thing {
	public String name;
	public static String description; //parameter belongs to class, not the object.
	public final static int number1 = 3; //contant needs initialization.
	public static int number2; //static doesnt.
	
	public static int count = 0;
	public static int id;
	public Thing() {
		id = count; //every object will have its unique ID.
		count++; //For every instance/object of the class Thing created, count is incremented.
	}
	
	public void showName() {
		//Instance methods can access static data.
		System.out.println("Object id: " + id + ", " + "Object name: " + name);
	}
	
	public static void showInfo() {
		System.out.println(description);
		//Below will not work. Static methods cannot output instance variables
		//System.out.println(name);
	}
}
public class App {

	public static void main(String[] args) {
		
		Thing.description = "And the description";
		Thing newThing1 = new Thing();
		newThing1.name = "Glen";
		newThing1.showName();
		
		Thing newThing2 = new Thing();
		newThing2.name = "Homer";
		newThing2.showName();

	}

}
