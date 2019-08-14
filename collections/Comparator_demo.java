package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Comparator_demo extends Emp_comparator {
	public Comparator_demo(int empID, String name) {
		super(empID, name);
	}
	
public static void main(String[] args) {
	Emp_comparator e1;
	Emp_comparator e2;
	Emp_comparator e3;
	e1=new Emp_comparator(101,"akash");
	e2=new Emp_comparator(103,"varun");
	e3=new  Emp_comparator(102,"harsha");
	Emp_comparator[] emps={e1,e2,e3};
	Arrays.sort(emps);
	System.out.println("Array sorted:"+Arrays.toString(emps));
	
	List<Emp_comparator> l=new ArrayList<Emp_comparator>();
	l.add(e1);
	l.add(e2);
	l.add(e3);
	System.out.println("size"+l.size()+"\t"+l);
	Collections.sort(l,new Compare_all());
	System.out.println("sorted"+l);
	
}
}
