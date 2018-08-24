package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void openFile() throws FileNotFoundException {
		File file1 = new File("testing.txt");
		
		FileReader fr = new FileReader(file1);
	}

}
