package capgemini.junit;

import org.junit.Test;
import static org.junit.Assert.*;
public class Assert_various_Types_Test {
@Test
public void testarrayEqual(){
	char[] exp={'j','a','v','a'};
	char[] act="java".toCharArray();
	assertArrayEquals(exp,act);
}
@Test
public void testAssertNull(){
	String text=null;
	assertNull("hi",text);
}
@Test
public void testAssertNotNull(){
	String text="hi";
	assertNotNull("hi",text);
}
@Test
public void testAssertSame(){
	Object object1=new Object();
	Object objec2=object1;
	assertSame(object1, objec2);
}
@Test
public void testAssertNotSame(){
	Object object1=new Object();
	Object objec2=new Object();
	assertNotSame(objec2, object1);
}
@Test
public void asserttrue(){
	assertTrue("5 greater than 3", 5>3);
}

}
