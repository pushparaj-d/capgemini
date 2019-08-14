package capgemini.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Calc_Add_Sub {
	@Test
	public void testadd() {
		Calculator c = new Calculator();
		int actual = c.add(10, 20);
		int expected = 30;
		assertEquals(expected, actual);
		// fail("testadd->Not yet implemented");
	}

	@Test
	public void testsub() {
		Calculator c = new Calculator();
		int actual = c.sub(20, 10);
		int expected = 10;
		assertEquals(expected, actual);
		// fail("testsub->Not yet implemented");
	}
}
