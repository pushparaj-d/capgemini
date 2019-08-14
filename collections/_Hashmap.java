package collections;

import java.util.HashMap;
import java.util.Iterator;

public class _Hashmap {
// allows only one null
	//
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap=new HashMap<>();
		System.out.println("size:"+hashmap.size()+"\t"+hashmap);
		hashmap.put(1, "ram");
		hashmap.put(3, "arun");
		hashmap.put(2, "kavin");
		System.out.println("size:"+hashmap.size()+"\n"+hashmap);
		System.out.println("Printing keys:");
		Iterator<Integer> ik=hashmap.keySet().iterator();// iterating using keys
		while (ik.hasNext()) {
			System.out.println(ik.next());
		}
		System.out.println("printing values:");
		Iterator<String> iv=hashmap.values().iterator();// iterating using values
		while (iv.hasNext()) {
			System.out.println(iv.next());
		}
		System.out.println("printing hashmap along with key&value:");
		Iterator<Integer> ikv=hashmap.keySet().iterator();// iterating using keys
		while (ikv.hasNext()) {
			Integer key=ikv.next();
			System.out.println(key+":"+hashmap.get(key));
		}
		
		
	}

}
