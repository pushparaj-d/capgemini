package lab3;

import java.util.Arrays;

public class Lab3_Excersice_1 {
	public static void main(String[] args) {
		int[] a = { 2, 3, 1, 6, 4 };
		System.out.println("integer array:"+Arrays.toString(a));
		System.out.println("Second Smallest:" + getSecondSmallest(a));
	}

	public static int getSecondSmallest(int[] a) {
		Arrays.sort(a);
		System.out.println("sorted integer array:"+Arrays.toString(a));

		return a[1];
	}
}
