package iostring.capgemini;

import java.io.File;
import java.util.Date;

public class File_class {
	public static void main(String[] args) {
		File file=new File("C:\\Users\\pushpd\\ecs\\hello.txt");
		System.out.println("Execute:"+file.canExecute());
		System.out.println("can read:"+file.canRead());
		System.out.println("can write:"+file.canWrite());
		System.out.println("parent:"+file.getParent());
		System.out.println("name:"+file.getName());
		System.out.println("is exist:"+file.exists());
		System.out.println("is file:"+file.isFile());
		System.out.println("length:"+file.length());
		System.out.println("last modified:"+new Date(file.lastModified()));
	//	System.out.println("delete:"+file.delete());
		System.out.println(File.listRoots());
	}

}
