package java_package;

class Circle {
	// fields...
	float radius;

	// constructor
	public Circle() {
		radius = 0.0f;
		System.out.println("default");
	}

	// constructor overloading
	public Circle(float pradius) {
		radius = pradius;
		System.out.println("parameter");
	}

	// methods
	public void draw() {
		System.out.println("circle is drawn");
	}

	public double calcArea() {
		return radius * radius * Math.PI;
	}

	// overriding
	@Override
	public String toString() {
		return "radius:" + radius;
	}
	@Override
	public boolean equals(Object obj) {
		Circle other=(Circle) obj;
		if(this.radius==other.radius)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Circle_Test {
	public static void main(String args[]) {
		//Circle c1, c2;
		//c1 = new Circle(5.5f);
		//c2 = new Circle(5.5f);
		Circle circles=new Circle(2);
		circles[0]=new Circle(5.5f);
		circles[1]=new Circle(9.5f);
		for(int i=0;i<circles.length;i++)
		{
			circles[i]
		}
		/*c1.draw();
		System.out.println("area of c1:" + c1.calcArea());
		c2.draw();
		System.out.println("area of c2:" + c2.calcArea());
		System.out.println(c1);
		System.out.println(c2.toString());
		if(c1.equals(c2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}*/
	}
}
