package capgemini.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exception_test {
@Test
public void div(){
	int n1=10;
	int n2=0;
	int exp=2;
	int act=n1/n2;
	assertEquals(exp,act);
}
@Test(expected=ArithmeticException.class)
public void div1(){
	int n1=10;
	int n2=0;
	int exp=2;
	int act=n1/n2;
	assertEquals(exp,act);
}
@Test
public void convertCase(){
	String text=null;
	String exp="uppercase";
	String act=text;
	assertEquals(exp, act);
}
@Test(expected=NullPointerException.class)
public void convertCase2(){
	String text=null;
	String exp="uppercase";
	String act=text;
	assertEquals(exp, act);
}

}
