package collections;

public class Boxing_unboxing {
	public static void main(String[] args) {
	int a=16;
	System.out.println("Boxing:");
	System.out.println(a);
	Integer b=new Integer(a);
	System.out.println(b);
	//explicit Boxing
	b=a;
	System.out.println("unboxing:");
	a=b.intValue();
	a=b;
	System.out.println(a);
	System.out.println(b);
	System.out.println("auto boxing and unboxing:");
	a=10;
	b=a;
	int c=new Integer(b);
	System.out.println(c);

	}
	}
