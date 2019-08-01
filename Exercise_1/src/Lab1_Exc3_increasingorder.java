import java.util.Scanner;

public class Lab1_Exc3_increasingorder {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int num;
		System.out.println("Enter the number:");
		num=obj.nextInt();
		CheckNumber(num);
		obj.close();
	}

	public static void CheckNumber(int num)
	{
		int count=0;
		String s=String.valueOf(num);
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)<s.charAt(i+1))
			{
				count++;
			}
		}
		if(count==s.length()-1)
		{
			System.out.println("The entered number is in increasing order....");
		}
		else{
			System.out.println("The entered number is not in increasing order....");
		}
		
	}
}
