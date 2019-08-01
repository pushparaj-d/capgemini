package Lab8;

import java.util.Scanner;

public class Lab8_Exercise_5 {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s;
		int count=0;
		System.out.println("Enter the string:");
		s=obj.next();
		for(int i=0;i<s.length()-1;i++)
		{
			if((int)s.charAt(i)<(int)s.charAt(i+1))
			{
				count++;
			}
		}
		if(count==s.length()-1)
		{
			System.out.println("The entered string is positive....");
		}
		else{
			System.out.println("The entered string is Negative");
		}
		obj.close();
	}
	

}
