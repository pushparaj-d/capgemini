package capgemini.java_beans;

public abstract class Shape {
	public Shape(){
		System.out.println("Shape -> default");
	}
	public void draw()
	{
		
	}
	public abstract float calcArea();
	public static Rect whoisBigger2(Rect r1,Rect r2){
		if(r1.getLength()<r2.getLength())
		{
			return r1;
		}
		else
		{
			return r2;
		}
	}
}

