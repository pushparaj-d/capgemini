package lab10_Exercise1;

import java.io.File;

public class FileProgram extends Thread {
	@SuppressWarnings("deprecation")
	public void run(){
		File file1 = new File("C:\\Users\\pushpd\\ecs\\source.txt");
		File file2 = new File("C:\\Users\\pushpd\\ecs\\target.txt");
		CopyDataThread obj=new CopyDataThread(file1,file2);
		obj.destroy();
	}
public static void main(String[] args) {
	FileProgram t1=new FileProgram();
	t1.start();
}
}
