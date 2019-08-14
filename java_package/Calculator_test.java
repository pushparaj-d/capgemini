package java_package;

interface calculator {

	//by default methods are public and abstract
	int add(int no1, int no2);

	public abstract int sub(int no1, int no2);
	default void defjadk8()
	{
		System.out.println("new feature of jdk......");
	}
}

interface Advcalculator {
	int mul(int no1, int no2);

	int div(int no1, int no2);
}

//interface are implemented via class
class calculatorImpl implements calculator, Advcalculator {
	@Override
	public int add(int no1, int no2) {
		return no1 + no2;
	}

	@Override
	public int sub(int no1, int no2) {
		return no1 - no2;
	}

	@Override
	public int mul(int no1, int no2) {
		return no1 * no2;
	}

	@Override
	public int div(int no1, int no2) {
		return no1 / no2;
	}
}
public class Calculator_test
{
	public static void main(String args[])
	{
		calculatorImpl c=new calculatorImpl();
		System.out.println("addition="+c.add(10,5));
		System.out.println("Subtraction="+c.sub(10,5));
		System.out.println("Multiplication="+c.mul(10, 5));
		System.out.println("division="+c.div(10, 5));
		c.defjadk8();
		
		c=new calculatorImpl();
		System.out.println("addition="+c.add(10,5));
		System.out.println("Subtraction="+c.sub(10,5));
		System.out.println("Multiplication="+c.mul(10, 5));
		System.out.println("division="+c.div(10, 5));
		
		System.out.println("addition="+c.add(10,5));
		System.out.println("Subtraction="+c.sub(10,5));
		System.out.println("Multiplication="+c.mul(10, 5));
		System.out.println("division="+c.div(10, 5));
	}
}
