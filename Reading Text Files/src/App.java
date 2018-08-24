import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "H:/script/glen.txt";
		
		File textFile = new File(fileName);
		
		Scanner in = new Scanner(textFile);
		
		String value = in.nextLine();
		System.out.println("Read value: "+ value);
		
		int count = 2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			
			System.out.println("Line: " + count + ": " + line);
			count++;
		}
		
		in.close();

	}

}
