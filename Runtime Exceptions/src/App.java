
public class App {

	public static void main(String[] args) {
		String[] text = {"one", "two", "three"};
		
		
		try {
		System.out.println(text[3]);
		} catch (Exception except) {
			System.out.println(except.toString());
		}

	}

}
