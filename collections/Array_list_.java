package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Array_list_ {
	
	public static void main(String[] args) {
		//ArrayList<String> list= new ArrayList<>(3);
		LinkedList<String> list= new LinkedList<>();
		System.out.println("size:"+list.size()+"\t"+list);
		list.add("sun");
		list.add("mon");
		list.add("wed");
		System.out.println("size:"+list.size()+"\t"+list);
		list.add(2,"tue");
		System.out.println("size:"+list.size()+"\t"+list);
		list.add("thu");
		list.add("fri");
		list.add("sat");
		//list.addAll(list);
		list.add(6,"holiday");
		if(list.contains("sat"))
		{
			list.set(list.indexOf("sat"),"saturday");
		}
		System.out.println("size:"+list.size()+"\t"+list);
		list.remove(6);
		for(Object obj:list)
		{
			System.out.print(obj+"\t");
		}
		System.out.println("iterator:");
		ListIterator<String> li=list.listIterator();
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}
	}
