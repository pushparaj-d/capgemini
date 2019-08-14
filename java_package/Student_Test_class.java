package java_package;

class Student {
	
	int rollNo;
	String name;
	float marks;
	final float OUT_OF_MARKS = 300;

	// default constructor...
	public Student() {
		super();
		this.rollNo=0;
		this.name=null;
		this.marks=0.0f;
	}
	
	// parametarized constructor
	public Student(int rollNo, String name, float marks) {
		super();
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	// Displaying details
	public void display() {
		System.out.println("Rollno:" + rollNo);
		System.out.println("Name:" + name);
		System.out.println("Mark:" + marks);
	}
	
	//Displaying 
	public void marksheet()
	{
		System.out.println("Percentage:"+calcPercentage());
		System.out.println("Grade:"+calculation());
	}
	
	//
	public float calcPercentage()
	{
		float result=(marks/OUT_OF_MARKS)*100;
		return result;
	}

	// other...
	public String calculation() {
		float result=calcPercentage();
		if (result > 90)
		{
			return "A";
		}
		else if(result>80)
		{
			return "B";
		}
		else if(result>70)
		{
			return "C";
		}
		else if (result>70) {
			return "D";
		}
		else if (result>50) {
			return "E";
		}
		else
			return "F";
	}
	
}

public class Student_Test_class {
	public static void main(String args[]) {
		Student s1=new Student(123,"ram",250);		
		s1.display();
		s1.marksheet();
		/*
		String[] sub={"PHY","CHEM","BIO"};
		float[] marks={54.4f,46.7f,60.5f};
		student s1=new Student(101,"arun",sub,marks);
		*/
		}
}
