package Lab12;

import java.util.Scanner;
import java.util.function.Consumer;

interface Factorial {
	public void calcFactorial(double num);
}

class Fact implements Factorial {
	double result = 1;

	@Override
	public void calcFactorial(double num) {
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		System.out.println(result);

	}
}

	public class Lab12_Exercise_5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		double num = s.nextDouble();
		Consumer<Double> consumer=new Fact()::calcFactorial;
		consumer.accept(num);
		s.close();
	}
	}
