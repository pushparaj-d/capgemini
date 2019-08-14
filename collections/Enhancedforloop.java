package collections;

import java.util.ArrayList;

public class Enhancedforloop {
	static void printArray(int[] a) {
		for (int aa : a) {
			System.out.println(aa);
		}
	}

	static void printCollection(ArrayList<Integer> al) {
		for (Object obj : al) {
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println("array:");
		printArray(a);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println("collections implementation using arraylist:");
		printCollection(al);
	//	Iterator<> iterator=a.iterator();
		}
}
