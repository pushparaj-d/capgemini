package capgemini.junit;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.DEFAULT)
public class Sequence_test_running {
@Ignore			// IGNORE
	@Test
public void testA(){
	System.out.println("Test A executed");
}

@Test(timeout=10000) 	//TIMED OUT
public void timedout(){
	System.out.println("timed out ofr 10 seconds...");
	while(true){
		
	}
	
}
@Test
public void testB(){
	System.out.println("Test B executed");
}
@Test
public void testD(){
	System.out.println("Test D executed");
}
@Test
public void testC(){
	System.out.println("Test C executed");
}
@Test
public void testE(){
	System.out.println("Test E executed");
}
@Test
public void testF(){
	System.out.println("Test F executed");
}
}
