package lab3;
import java.util.Arrays;
public class Lan3_Excercise_2 {
	public static String getSorted(String[] a)
	{Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int l=a.length;
		int n=a.length/2;
		if(a.length%2==0)
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i].toUpperCase());

			}
			for(int i=n;i<l;i++)
			{
				
				System.out.println(a[i].toLowerCase());
			}
		}
		if(a.length%2!=0)
		{
			for(int i=0;i<=n;i++)
			{
				
				System.out.println(a[i].toUpperCase());
			}
			for(int i=n+1;i<=l-1;i++)
			{
				
				System.out.println(a[i].toLowerCase());
			}
		}
		return null;	
	}
	public static void main(String[] args) {
	String[] a={"arun","karthick","teja","uma","yuvaraj"};
	getSorted(a);
	
}
}
