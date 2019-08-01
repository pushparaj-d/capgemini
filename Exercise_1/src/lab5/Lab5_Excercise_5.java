package lab5;

import java.util.Scanner;

public class Lab5_Excercise_5 {
	static void validate(int age) throws InvalidAgeException {
		if (age < 15)
			throw new InvalidAgeException("age is less than 15. Not allowed to enter");
		else
			System.out.println("welcome to Function");
	}

	public static void main(String args[]) {
		try {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			validate(n);
			s.close();
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}
			
		}
}
