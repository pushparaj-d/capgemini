package iostring.capgemini;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Iostream_autoclosing {
	public static void main(String[] args) {
		fileInputStream_2();
	}
	public static void fileInputStream_2() {
		int input = 0;
		File f = new File("C:\\Users\\pushpd\\ecs\\hello.txt");
		try (FileInputStream fi = new FileInputStream(f)) {
			while ((input = fi.read()) != -1) {
				System.out.print((char) input);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
