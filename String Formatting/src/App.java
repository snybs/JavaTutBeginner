
public abstract class App {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		
		sb.append("Glen ");
		sb.append("is ");
		sb.append("close by!");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		s.append("Yes I am").toString();
		
		System.out.println(s);
		
		//Formatting below
		
		System.out.println("Im writing something i think \t After the tab i add a few words \nAnd now im down a bit!");
		
		System.out.printf("I have %-10d money!\n", 0);
		
		for(int i = 0; i < 20; i++){
			System.out.printf("%2d: something more\n", i);
		}
		
		

	}

}
