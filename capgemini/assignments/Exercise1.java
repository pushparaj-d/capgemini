package capgemini.assignments;

import java.io.File;

public class Exercise1 {
	static int txtcount;
	static int javacount;
	static int classcount;
	public static void moveDirectory(String parents) {
		File directory = new File(parents);
		if (directory.exists() && directory.isDirectory()) {
			File[] contains = directory.listFiles();
			for (File file : contains) {
				if (file.isFile()) {
					System.out.println("FILE NAME->" + file.getName());
				} else if (file.isDirectory()) {
					System.out.println("DIRECTORY->" + file.getName());
				}
				if(file.getName().endsWith(".txt")){
					txtcount++;
				}
				if(file.getName().endsWith(".java")){
					javacount++;
				}
				if(file.getName().endsWith(".class")){
					classcount++;
				}
			}
			String parentPath = directory.getParentFile().getAbsolutePath();
			System.out.println("parent folder:" + parentPath);
		}
	}

	public static void main(String[] args) {
		String path = "C:\\capgemini";
		moveDirectory(path);
		System.out.println("Total .txt files:"+txtcount);
		System.out.println("Total .java files:"+javacount);
		System.out.println("Total .class files:"+classcount);
		}
	}
