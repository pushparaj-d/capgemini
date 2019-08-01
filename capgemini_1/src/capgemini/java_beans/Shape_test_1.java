package capgemini.java_beans;

public class Shape_test_1 {
	
	public static void main(String args[])
	{
		Cir c= new Cir();
		//c.Cir();
		c.getRadius();
		c.setRadius(5.5f);
		System.out.println("Area of circle:"+c.calcArea());
		Rect r=new Rect();
		//r.Rect();
		r.getLength();
		r.getBreadth();
		r.setLength(3.5f);
		r.setBreadth(4.6f);
		System.out.println("Area of rectangle:"+r.calcArea());
		Rect r1,r2;
		r1=new Rect(10.2f,4.5f);
		r2=new Rect(5.5f,3.3f);
		Rect b1=Rect.whoisBigger(r1,r2);
		System.out.println("bigger result->"+b1);
		Rect b2=Shape.whoisBigger2(r1,r2);
		System.out.println("smaller result->"+b2);
		Triangle t=new Triangle();
		t.getLength();
		t.getBreadth();
		t.getHeight();
		t.setHeigth(5.5f);
		t.setBreadth(4.7f);
		t.setLength(6.2f);
		System.out.println("Area of triangle:"+t.calcArea());
	}
}
