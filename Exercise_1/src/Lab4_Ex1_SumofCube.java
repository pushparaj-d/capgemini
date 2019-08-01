import java.util.Scanner;

public class Lab4_Ex1_SumofCube 
{
	public static int SumofCube(int n)
	{
		int su=0,suu=0,sum=1;
		String s= String.valueOf(n);
		for(int i=0;i<s.length();i++)
		{
			su=Character.getNumericValue(s.charAt(i));
			sum=(su*su*su);
			suu+=sum;
		}
		return suu;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int result=0;
		System.out.println("enter no");
		int n=s.nextInt();
		result=SumofCube(n);
		System.out.println("result:"+result);
		s.close();
	}
	
}
