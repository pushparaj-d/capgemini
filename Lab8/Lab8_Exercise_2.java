package Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab8_Exercise_2 {

	public static void main(String[] args) {
		try
		{
			int i=1;
File file= new File("C:\\Users\\pushpd\\ecs\\hello.txt");
Scanner inputfile=new Scanner(file);
//String line=inputfile.nextLine();
while(inputfile.hasNext()){
	String name=inputfile.nextLine();
	System.out.println(i+"."+name);
	i++;
	
}
inputfile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally
		{
			System.out.println("end of document reading...");
		}

}
}
