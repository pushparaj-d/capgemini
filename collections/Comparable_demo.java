package collections;

import java.util.Arrays;
 
public class Comparable_demo extends Emp  {
public Comparable_demo(int empID, String name) {
		super(empID, name);
	}

public static void main(String[] args) {
	Emp e1,e2,e3;
	e1=new Emp(101,"hari");
	e2=new Emp(102,"varun");
	e3=new  Emp(103,"aakash");
	Emp[] emps={e1,e2,e3};
	Arrays.sort(emps);
	System.out.println("Array sorted:"+Arrays.toString(emps));
	}
}



