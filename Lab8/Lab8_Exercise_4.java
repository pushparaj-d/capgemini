package Lab8;

import java.io.File;

public class Lab8_Exercise_4 {
public static void main(String[] args) {
			File file=new File("C:\\Users\\pushpd\\ecs\\hello.txt");
			System.out.println("Execute:"+file.canExecute());
			System.out.println("can read:"+file.canRead());
			System.out.println("can write:"+file.canWrite());
			System.out.println("name:"+file.getName());
			System.out.println("is exist:"+file.exists());
			System.out.println("is file:"+file.isFile());
			System.out.println("length of the file:"+file.length());
		}
}
