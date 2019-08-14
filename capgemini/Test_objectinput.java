package iostring.capgemini;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test_objectinput {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\pushpd\\ecs\\hello.txt");
		try {
			FileInputStream fileinput = new FileInputStream(file);
			ObjectInputStream onbjectinput = new ObjectInputStream(fileinput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
