package capgemini.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class,Calc_Add_Sub.class,Calc_Mul_Div.class })
public class AllTests {

}
