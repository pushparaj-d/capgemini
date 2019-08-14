package Lab8;

import java.util.Scanner;

public class Lab8_Excercise_7 {
	public static boolean validation(String username) {
		if (username.endsWith("_job")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the username:");
		String Username =s.next();
		if (Username.length() > 10) {
			if(validation(Username)==true){
				System.out.println("Validation is success. your username is proper.");
			}
			else{
				System.out.println("Validation Failure.");
			}
		} else {
			System.out.println("Username should atleast have 11 character...");
		}
		s.close();

	}
}
