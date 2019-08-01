package lab5;

import java.util.Scanner;

public class Lab5_Exercise_3 {
	public static void printPrimeNumbers(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
			count=0;
		}
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	printPrimeNumbers(n);
	s.close();
	
}
}
