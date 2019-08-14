package iostring.capgemini;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Student_data_opstream {
	private int roll_no;
	private double marks;
	private String name;

	public Student_data_opstream() {
		super();
	}
	public Student_data_opstream(int roll_no, String name, double marks) {
		this.roll_no=roll_no;
		this.name=name;
		this.marks=marks;
		
	}

	@Override
	public String toString() {
		return "Student_data_opstream [roll_no=" + roll_no + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student_data_opstream other = (Student_data_opstream) obj;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll_no != other.roll_no)
			return false;
		return true;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class Student
{
	public static void main(String[] args) {
	Student_data_opstream s1=new Student_data_opstream(101,"ram",85.82);
			File f = new File("C:\\Users\\pushpd\\ecs\\hello.txt");
		try{
			FileOutputStream fileoutput = new FileOutputStream(f);
			ObjectOutputStream obj=new ObjectOutputStream(fileoutput);
		}
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
