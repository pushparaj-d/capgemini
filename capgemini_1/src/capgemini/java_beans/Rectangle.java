package capgemini.java_beans;

public class Rectangle {

	// field
	private float length, breadth;

	public Rectangle() {
		// length=0.0f;
		this(0.0f, 0.0f);
		System.out.println("default cons");
	}

	public Rectangle(float length, float breadth) {
		setLength(length);
		setBreadth(breadth);
		// this.length=length;
		System.out.println("parameter cons");
	}

	// setter method
	public void setLength(float length) {
		if (length > 0) {
			this.length = length;
		}
	}

	
	@Override
	public String toString() {
		return "Rectangle [length=" + getLength() + ", breadth=" + getBreadth() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if ( breadth !=  other.breadth)
			return false;
		if ( length !=  other.length)
			return false;
		return true;
	}

	// setter method
	public void setBreadth(float breadth) {
		if (breadth > 0) {
			this.breadth = breadth;
		}
	}

	// show method
	void showRectangle() {
		System.out.println("length:" + getLength());
		System.out.println("Breadth:"+ getBreadth());
		System.out.println("Area:"+calcArea());
	}
	
	// getter method
	public float getLength()
	{
		return length;
	}
	
	// getter method
	public float getBreadth()
	{
		return breadth;
	}

	public float calcArea()
	{
		return length*breadth;
		
	}
	public static void main(String args[]) {
		// declaration
		Rectangle r1;
		// object instantiation
		r1 = new Rectangle();
		// accessing field of an object
		r1.length = 5.5f;
		r1.breadth=9.5f;
		// accessing method of an object
		r1.showRectangle();
	}
}
