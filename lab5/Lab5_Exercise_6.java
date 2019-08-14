package lab5;

import java.util.Scanner;

public class Lab5_Exercise_6 {
	static void validate(double salary) throws EmployeeException {
		if (salary < 30000)
			throw new EmployeeException("salary is very low");
		else
			System.out.println("Good... your salary is high...");
	}

	public static void main(String args[]) {
		try {
			Scanner s = new Scanner(System.in);
			double n = s.nextDouble();
			validate(n);
			s.close();
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);
		}

	}
}
