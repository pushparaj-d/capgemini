package Lab11;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyDataThread implements Runnable {
	private static int COUNT = 0;

	public CopyDataThread() {
	}

	public void run() {
		try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\pushpd\\ecs\\source.txt"));
				BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\pushpd\\ecs\\target.txt"))) {
			int str;
			while((str=br.read())!=-1){
				System.out.print((char)str);
			bw.write(str);
			new Thread().join();
			COUNT++;
			if(COUNT==10){
				System.out.println("10 characters are copied");
				Thread.sleep(5000);
				COUNT=0;
			}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
