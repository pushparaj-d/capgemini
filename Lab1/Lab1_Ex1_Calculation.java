package Lab1;
import java.util.Scanner;
public class Lab1_Ex1_Calculation 
{
	public static int calculatesum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			{
				sum+=i;
			}
			
		}
		
		return sum;
	}
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		int result=0;
		System.out.println("enter no");
		int n=s.nextInt();
		result=calculatesum(n);	
		System.out.println("result="+result);
	}
}
