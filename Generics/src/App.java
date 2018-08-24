import java.util.ArrayList;
import java.util.HashMap;

class Animal {
	
}

public class App {

	public static void main(String[] args) {
		
		//Old way of creating ArrayList. Before java 5 //////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("orange");
		list.add("banana");
		
		String fruit = (String)list.get(0);
		System.out.println(fruit);
		
		//new way of generics ///
		
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("bird");
		
		//no need to downcast here!
		String animal = strings.get(0);
		
		System.out.println(animal);
		
		//there can be more than one type argument ///
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// java 7 style //
		
		ArrayList<Animal> somelist = new ArrayList<>();
		//You can parameterize any type of object, i.e also your own classes. will still be a list of animals
		

	}

}
