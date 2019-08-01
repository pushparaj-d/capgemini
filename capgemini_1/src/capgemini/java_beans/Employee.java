package capgemini.java_beans;

public class Employee {
	private int empid;
	private String name;
	public static int SEQUENCE;
	public static int COUNT;
	static{
		SEQUENCE=100;
		COUNT=0;
		System.out.println("inside stack block");
	}
	
	public Employee()
	{
		super();
		empid=++SEQUENCE;
		System.out.println("\ninside DEFAULT cons block");
		COUNT++;
	}
	public Employee(int empid, String name)
	{
		super();
		this.empid=empid;
		System.out.println("\ninside param cons block	");
		this.name=name;
		SEQUENCE++;
		COUNT++;
	}
	public Employee(String name)
	{
		super();
		this.name=name;
		System.out.println("\ninside param cons block");
		empid=++SEQUENCE;
		COUNT++;
	}
	public int getEmpid()
	{
		return empid;
	}
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	public String getName()
	{
		return name;
	}
	public String setName(String name)
	{
		return name;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	public String toString_builder() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empid=");
		builder.append(empid);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	public String toString_format() {
		return String.format("Employee [empid=%s, name=%s]", empid, name);
	}
	public String toString_chained() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empid=").append(empid).append(", name=").append(name).append("]");
		return builder.toString();
	}
	public static int getSEQUENCE() {
		return SEQUENCE;
	}
	public void show(){
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+name);
	}
	
}
