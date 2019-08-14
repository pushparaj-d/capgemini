package iostring.capgemini;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Test_ioStream {
	public static void main(String[] args) {
		File f;
		FileInputStream fi = null;
		f = new File("C:\\Users\\pushpd\\ecs\\hello.txt");
		try {
			fi = new FileInputStream(f);
			int input = 0;
			while ((input = fi.read()) != -1) {
				System.out.print((char) input);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
				if (f.exists()) {
					System.out.println("\nfile closed successfully....");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
