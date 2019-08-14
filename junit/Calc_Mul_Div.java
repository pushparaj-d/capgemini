package capgemini.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calc_Mul_Div {
	@Test
	public void testmul() {
		Calculator c = new Calculator();
		int actual = c.mul(10, 20);
		int expected = 200;
		assertEquals(expected, actual);
		// fail("testmul->Not yet implemented");
	}

	@Test
	public void testdiv() {
		Calculator c = new Calculator();
		int actual = c.div(20, 10);
		int expected = 2;
		assertEquals(expected, actual);
		// fail("testdiv->Not yet implemented");
	}
}
