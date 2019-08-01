package java_package;

public class Equal_test {
	private static void main(String args[]) {
		String name="cap";
		String company=new String("cap");
		if(name==company)
		{
			System.out.println("you are an employee");
		}
		else
		{
			System.out.println("you are not an employee");
		}
		if(name.equals(company))
		{
			System.out.println("you are an employee");
		}
		else
		{
			System.out.println("you are not an employee");
		}
	}
}
