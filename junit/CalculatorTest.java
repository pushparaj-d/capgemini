package capgemini.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testadd() {
		Calculator c=new Calculator();
		int actual=c.add(10,20);
		int expected=30;
		assertEquals(expected, actual);
		//fail("testadd->Not yet implemented");
	}
	@Test
	public void testsub() {
		Calculator c=new Calculator();
		int actual=c.sub(20,10);
		int expected=10;
		assertEquals(expected, actual);
		//fail("testsub->Not yet implemented");
	}
	@Test
	public void testmul() {
		Calculator c=new Calculator();
		int actual=c.mul(10,20);
		int expected=200;
		assertEquals(expected, actual);
		//fail("testmul->Not yet implemented");
	}
	@Test
	public void testdiv() {
		Calculator c=new Calculator();
		int actual=c.div(20,10);
		int expected=2;
		assertEquals(expected, actual);
		//fail("testdiv->Not yet implemented");
	}
	

}
