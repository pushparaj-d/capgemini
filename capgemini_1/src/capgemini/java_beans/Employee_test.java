package capgemini.java_beans;

public class Employee_test {
public static void main(String[] args) {
	Employee e1,e2,e3;
	e1=new Employee("arun");
	e1.show();
	e2=new Employee("barath");
	e2.show();
	e3=new Employee("kavin");
	e3.show();
	System.out.println("Total count of objects created="+Employee.COUNT);
}
}
