package lab10_Exercise1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread extends Thread {
	
	public CopyDataThread() {

	}
	public CopyDataThread(File file1, File file2) {
		CopyDataThread t2 = new CopyDataThread();
		t2.start();
	
			try {
				int c, count = 0;
				FileInputStream fin;
				fin = new FileInputStream(file1);
				FileOutputStream fout = new FileOutputStream(file2);
				
				while ((c = fin.read()) != -1) {
					fout.write((char) c);
					count++;
					System.out.print((char) c);
					if (count == 10) {
						System.out.println("\t10 characters are copied...");
						count = 0;
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}
				System.out.println("\nFile reading ended....");
				fin.close();
				fout.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}


