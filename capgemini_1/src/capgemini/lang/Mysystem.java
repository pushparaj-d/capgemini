package capgemini.lang;
import capgemini.java_beans.Employee_test;

public class Mysystem {
	public static void main(String[] args) {
		//current milli seconds
		long time = System.currentTimeMillis();
		// nano time
		long s = System.nanoTime();
		System.out.println("current:" + time + "\nnano time:" + s);
		// line separator
		String str="hi"+System.lineSeparator()+"hello";
		System.out.println(str);
		for(int i=0;i<10000;i++)
		{
			new Employee_test();
		}
		long startmemory=Runtime.getRuntime().freeMemory();
		long starttimemillis=System.currentTimeMillis();
		long endmemory=Runtime.getRuntime().freeMemory();
		long endtimemillis=System.currentTimeMillis();
		System.out.println("startmemory:\t"+startmemory);
		System.out.println("starttimemillis\t"+starttimemillis);
		System.out.println("endmemory\t"+endmemory);
		System.out.println("endtimemillis\t"+endtimemillis);
		
		// garbage collector
		System.gc();
		// exit
		System.exit(10);
	}

}
