package collections;

import java.util.HashSet;
import java.util.Iterator;

public class _Set {
public static void main(String[] args) {
	HashSet<String> hashset= new HashSet<>();
	hashset.add("jan");
	hashset.add("feb");
	hashset.add("sun");
	System.out.println("size:"+hashset.size()+"\t"+hashset);
	hashset.add("null");
	hashset.remove("null");
	System.out.println("Iterator:");
	Iterator<String> iterator =hashset.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	System.out.println("Extented for:");
	for(String value:hashset)
	{
		System.out.println(value);
	}
}
}
