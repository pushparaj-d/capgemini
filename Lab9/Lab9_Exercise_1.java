package Lab9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Lab9_Exercise_1 {
	public static List<Integer> getValues(HashMap<String, String> hashmap){
		List<String> l=new ArrayList<>();
		for(int i=1;i<=hashmap.size();i++){
		l.add(hashmap.get(i));
		}
		Iterator<String> ikv=hashmap.keySet().iterator();// iterating using keys
		while (ikv.hasNext()) {
			String key=ikv.next();
			System.out.println(key+":"+hashmap.get(key));
		}
		Collections.sort(l);
		System.out.println(l);
		return null;
	}
	public static void main(String[] args) {
		HashMap<String,String> hashmap = new HashMap<>();
		hashmap.put("kumar","ram");	
		hashmap.put("arun","karthick");
		hashmap.put("kavin","k");
		System.out.println("size:" + hashmap.size() + "\n" + hashmap);
		getValues(hashmap);
	}
}