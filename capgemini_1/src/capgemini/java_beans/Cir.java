package capgemini.java_beans;

public class Cir extends Shape {
	private float radius;

	// setter method
	public void setRadius(float radius) {
		if (radius > 0) {
			this.radius = radius;
		}
	}

	// getter method
	public float getRadius() {
		return radius;
	}

	// calculate area
	public float calcArea() {
		return (float) (radius * radius * Math.PI);

	}

	public static void main(String args[]) {

	}
}
