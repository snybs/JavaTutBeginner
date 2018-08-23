import world.Plant;

/*
 * private -- only within same class
 * public --- from anywhere
 * proteted --- same class, subclass and same package
 * no modifier --- same package only
 */

public class App {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		
		System.out.println(plant1.name);
		System.out.println(plant1.ID);
		
		//wont work, type is private
		//System.out.println(plant1.type);
		
		//size is protected. app is not in same package as plant so it wont work.
		//System.out.println(plant1.size);
		
		//wont work. since height is in different package (height is a package level variable)
		//System.out.println(plant1.height);

	}

}
