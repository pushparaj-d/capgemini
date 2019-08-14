package java_package;

class Rectangle {
	// fields
	float length, breadth;

	// constructor
	public Rectangle() {
		length = 12.2f;
		breadth = 10.5f;
		System.out.println("default");
	}

	// constructor overloading
	public Rectangle(float llength, float bbreadth) {
		length = llength;
		breadth = bbreadth;
		System.out.println("parameter");
	}

	// methods
	public void draw() {
		System.out.println("Rectangle is drawn");
	}

	public double calcArea() {
		return length * breadth;
	}

	// overriding
	@Override
	public String toString() {
		return "length:" + length + "\t" + "breadth:" + breadth;
	}

	@Override
	public boolean equals(Object obj) {
		Rectangle other = (Rectangle) obj;
		if (this.length == other.length && this.breadth == other.breadth) {
			return true;
		} else {
			return false;
		}
	}
}

public class Rectangle_Test {
	public static void main(String args[]) {
		Rectangle c1, c2;
		c1 = new Rectangle(5.5f, 6.5f);
		c2 = new Rectangle(5.5f, 6.5f);

		c1.draw();
		System.out.println("area of c1:" + c1.calcArea());
		c2.draw();
		System.out.println("area of c2:" + c2.calcArea());
		System.out.println(c1);
		System.out.println(c2.toString());
		if (c1.equals(c2)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}
}
