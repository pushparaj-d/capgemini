package lab3;

import java.util.Arrays;

public class Lab3_Excercise_3 {
	public static void getSorted(int[] a) {
		int ll = a.length;
		System.out.println("normal array" + Arrays.toString(a));
		for (int i = 0; i < ll - 1; i++) {
			for (int j = i; j < ll - 1; j++) {
				int num = a[i], reversed = 0;
				while (num != 0) {
					int digit = num % 10;
					reversed = reversed * 10 + digit;
					num /= 10;
				}
				a[i] = reversed;
			}
		}
		System.out.println("reversed array:" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("sorted array:" + Arrays.toString(a));
	}

	public static void main(String[] args) {
		int[] a = { 42, 74, 71, 59, 61, 39 };
		getSorted(a);
	}
}
