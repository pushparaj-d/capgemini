package capgemini.java_beans;

public class Triangle {
	private float length, breadth,height;

	// setter method
	public void setLength(float length) {
		if (length > 0) {
			this.length = length;
		}
	}
	public void setHeigth(float height) {
		if (height > 0) {
			this.height = height;
		}
	}
	public Triangle() {
		// length=0.0f;
		this(0.0f, 0.0f,0.0f);
		//System.out.println("default cons");
	}
	public Triangle(float length, float breadth, float height) {
		setLength(length);
		setBreadth(breadth);
		// this.length=length;
		//System.out.println("parameter cons");
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
	public float getHeight() {
		return height;
	}


	public float calcArea() {
		return length * breadth*height;

	}

	public static void main(String args[]) {
	}
	
}
