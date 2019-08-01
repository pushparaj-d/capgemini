package lab5;

import java.util.Scanner;

public class Lab5_Exercise_2 {
	static int n1 = 1, n2 = 1, n3 = 0;

	public static void f(int n1, int n2) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter range:");
		int n = s.nextInt();
		System.out.println(" fibonacci series:\n\t"+n1+"\n\t"+n2+"\n");
		for (int i = 2; i < n; i++) {
			n3 = n1 + n2;
			System.out.println("\t" + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println("Nth value of fibonacci series:");
		System.out.println("\t" + n3);
		s.close();
	}

	public static int recursive_fibonacci(int n) {

		if (n > 0) {
			n3 = n1 + n2;
			System.out.println("\t"+n3);
			n1 = n2;
			n2 = n3;

		}
		if (n == 0) {
			System.out.println("Nth value of Recursive fibonacci series:\n\t" + n3);
		}
		return recursive_fibonacci(n - 1);
	}

	public static void main(String[] args) {
		int n1 = 1, n2 = 1;
		f(n1, n2);
		System.out.println(" fibonacci series:\n"+n1+"\n"+n2+"\n");
		recursive_fibonacci(5-2);
	}
}