package java_package;

import java.util.Arrays;



class Array_sort_impl implements Array {
	int[] num;

	@Override
	public void sortAsc(int[] n) {
		this.num = n;
		int[] a = {};
		for (int i = 0; i < num.length; i++) {
			if (num[i] > num[i + 1]) {
				int t;
				t = num[i];
				num[i] = num[i + 1];
				num[i + 1] = t;

			}
			a[i] = num[i];
		}
		System.out.println(Arrays.toString(a));
	}

	@Override
	public void sortDes(int[] n) {
		this.num = n;
		int[] b = {};
		for (int i = 0; i < num.length; i++) {
			if (num[i] < num[i + 1]) {
				int t;
				t = num[i];
				num[i] = num[i + 1];
				num[i + 1] = t;

			}
			b[i] = num[i];
		}
		System.out.println(Arrays.toString(b));
	}

}

public class Array_sort {
	public static void main(String args) {
		int[] a = { 1, 2, 3, 4, 5, 9, 7, 6 };
		System.out.println(Arrays.toString(a));
		Array_sort_impl ar = new Array_sort_impl();
		ar.sortAsc(a);
		ar.sortDes(a);
	}
}
