package capgemini.java_beans;

public class Rect extends Shape {
	private float length, breadth;

	// setter method
	public void setLength(float length) {
		if (length > 0) {
			this.length = length;
		}
	}
	public Rect() {
		// length=0.0f;
		this(0.0f, 0.0f);
		//System.out.println("default cons");
	}
	public Rect(float length, float breadth) {
		setLength(length);
		setBreadth(breadth);
		// this.length=length;
		//System.out.println("parameter cons");
	}
	@Override
	public String toString() {
		return "Rect [length=" + getLength() + ", breadth=" + getBreadth() + "]";
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(breadth);
		result = prime * result + Float.floatToIntBits(length);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rect other = (Rect) obj;
		if (getBreadth()!= getBreadth())
			return false;
		if (Float.floatToIntBits(length) != Float.floatToIntBits(other.length))
			return false;
		return true;
	}

	// setter method
	public void setBreadth(float breadth) {
		if (breadth > 0) {
			this.breadth = breadth;
		}
	}

	// getter method
	public float getLength() {
		return length;
	}

	// getter method
	public float getBreadth() {
		return breadth;
	}

	public float calcArea() {
		return length * breadth;

	}

	public static void main(String args[]) {
	}
	public static Rect whoisBigger(Rect r1,Rect r2){
		if(r1.getLength()>r2.getLength())
		{
			return r1;
		}
		else
		{
			return r2;
		}
	}
}
