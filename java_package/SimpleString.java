package java_package;

public class SimpleString {
public static void main(String[] args) {
	String s1="java";
	String s2="java java";
	String s3=new String("java");
	char[] value={'j','a','v','a'};
	String s4=new String(value);
	String s5=new String(s4);
	if(s1==s2)
	{
		System.out.println("s1==s2");
	}
	if(s1!=s3)
	{
		System.out.println("s1!=s3");
	}
	System.out.println("s1 equals s3:\t"+s1.equals(s3));
	System.out.println(s5);
	System.out.println(s3.charAt(2));
	System.out.println(s3.concat(s5));
	System.out.println(s2.endsWith(s1));
	System.out.println(s2.getBytes());
	System.out.println(s3.indexOf(3));
	System.out.println(s3.indexOf(s1));
	System.out.println(s5.isEmpty());
	System.out.println(value.length);
	System.out.println(s2.split("ja"));
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.startsWith("j"));
	
}
}
