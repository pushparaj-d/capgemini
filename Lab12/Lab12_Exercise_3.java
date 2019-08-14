package Lab12;

import java.util.Scanner;
interface Authentication{
	public String validation(String userName,String password);
}
public class Lab12_Exercise_3 {
	static String userName;
	static String password;
public static  void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter username:");
	 userName=s.next();
	System.out.println("Enter the password:");
	 password=s.next();
	s.close();
	Authentication obj=(String userName,String password)->{
		if(userName.equals("pushparaj")&&password.equals("password"))
		{
			System.out.println("TRUE");		}
		else
			System.out.println("FALSE");
		return null;
	};
	obj.validation(userName, password);
	
}
}
