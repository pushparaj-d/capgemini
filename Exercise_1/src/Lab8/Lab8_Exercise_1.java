package Lab8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab8_Exercise_1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String n=s.nextLine();
	int sum=0;
	StringTokenizer line =new StringTokenizer(n);
	while(line.hasMoreTokens())
	{
		int i=Integer.parseInt(line.nextToken());
		System.out.println(i);
		sum+=i;
	}
	System.out.println("the sum is:"+sum);
s.close();
}
}
