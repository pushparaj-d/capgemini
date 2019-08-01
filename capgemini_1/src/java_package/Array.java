package java_package;

import java.util.Arrays;

public class Array
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		int b[]={1,2,3,4,5};
		for(int bb:b)
		{
			System.out.println(bb);
		}
		String[] c={"hi","hello","welcome"};
		System.out.println(Arrays.toString(c));
		for(String cc:c)
		{
			System.out.println(cc);
		}
		char[] d={'a','e','i','o','u'};
		System.out.println(Arrays.toString(d));
		int e;
		e=System.out.println(Arrays.toString(d));
		System.out.println(e);
	}
}
