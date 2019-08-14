package Lab11;

import lab10_Exercise1.CopyDataThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgram{
	public static void main(String[] args) {
		Runnable runnable=new CopyDataThread();
		ExecutorService executorservice=Executors.newSingleThreadExecutor();
		executorservice.submit(runnable);
		executorservice.shutdown();
	}
}
