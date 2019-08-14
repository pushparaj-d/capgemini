package java_package;


abstract class Istack implements IssStack
{
	private String s;
	public abstract String push(String s);
	{
		push(s);
	
	}
}
public class Stack
{
	public static void main(String args[])
	{
		Stack o=new Stack();
		((IssStack) o).push("hi");
		((IssStack) o).push("hello");
		((IssStack) o).pop("hi");
	}

}