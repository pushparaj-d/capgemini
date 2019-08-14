package capgemini.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_lifecyscle_tes {
@BeforeClass
public static void beforeclass(){
	System.out.println("lifecycle->before class");
}
@Before
public  void before(){
	System.out.println("\tlifecycle->before method");
}
@Test
public void testone(){
	System.out.println("\t\tlifecycle->test1");
}
@Test
public void testtwo(){
	System.out.println("\t\tlifecycle->test2");
}
@After
public void after(){
	System.out.println("\tlifecycle->after method");
}
@AfterClass
public static void afterclass()
{
	System.out.println("lifecycle-> after class");
}
}
