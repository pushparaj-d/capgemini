package capgemini.junit;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;

public class Java_Runner {
public static void main(String[] args) {
	
	System.out.println("running junit test case using junitcore...");
	org.junit.runner.Result result=JUnitCore.runClasses(Calc_Mul_Div.class,Calc_Add_Sub.class);
	for(Failure failure:result.getFailures()){
		System.out.println(failure.toString());
	}
	System.out.println("Test successful:"+result.wasSuccessful());
}
}
