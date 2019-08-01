package Lab9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Lab9_Exercise3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no.of.elements in array:");
		int n = s.nextInt();
		int[] a = new int[n];
		System.out.println("Enter" + n + "elements:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		getSquares(a, n);
		s.close();
	}

	public static void getSquares(int[] a, int n) {

		HashMap<Integer, Integer> hmap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			hmap.put(a[i], a[i] * a[i]);
		}
		Iterator<Integer> ikv = hmap.keySet().iterator();// iterating using keys
		while (ikv.hasNext()) {
			Integer key = ikv.next();
			System.out.println(key + ":" + hmap.get(key));
		}
	}

}
