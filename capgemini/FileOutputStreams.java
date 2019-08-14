package iostring.capgemini;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreams {
public static void main(String[] args) {
	String message="how are you";
	File f = new File("C:\\Users\\pushpd\\ecs\\hello.txt");
	try(FileOutputStream fileoutput=new FileOutputStream(f)){
		fileoutput.write(message.getBytes());
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
