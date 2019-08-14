package collections;

import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		String str = "hi";
		list.add("string");
		list.add(str);
		list.add(str + str);
		System.out.println(list.size());
		System.out.println(list.contains(42));
		System.out.println(list.contains("hihi"));
		list.remove("hi");
		System.out.println(list.size());

	}
}
