package Lab1;


public class Lab1_Exc4_PowerofTwo 
{
	public static void main(String args[])
	{
		boolean result;
		result=PowerofTwo(12);
		System.out.print(result);
	}
	public static boolean PowerofTwo(int n)
	{
				do
		{
			n=n/2;
		}while(n%2==0);
		if(n==1)
			return true;
		else 
			return false;
		
	}
}
