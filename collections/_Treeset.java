package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class _Treeset {
	public static void main(String[] args) {
		TreeSet<String> treeset= new TreeSet<>();
		System.out.println("size:"+treeset.size()+"\t"+treeset);
		treeset.add("a");
		treeset.add("b");
		treeset.add("b");
		treeset.add("c");
		System.out.println("Assending Iterative:");
		System.out.println("size:"+treeset.size()+"\t"+treeset);
		Iterator<String> iterator =treeset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("Extented for:");
		for(String value:treeset)
		{
			System.out.println(value);
		}
		System.out.println("Descending Iterative:");
		Iterator<String> desiterator =treeset.descendingIterator();
		while(desiterator.hasNext())
		{
			System.out.println(desiterator.next());
		}
	}

}
