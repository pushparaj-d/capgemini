
public class Lab1_Ex2_CalculateDifference 
{
	public static int CalculateDifference(int n)
	{
		int square=0,sum=0,sum1=0,sum2;
		for(int i=1;i<=n;i++)
		{
			square+=(i*i);
			sum1+=i;
		
		}
		sum2=sum1*sum1;
		sum=square-sum2;
		return sum;
	}
	public static void main(String args[])
	{
		int result=0;
		result=CalculateDifference(2);
		System.out.println("result:"+result);
	}
}
