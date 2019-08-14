package com.capgemini.app.my_app;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ capgemini.junit.CalculatorTest.class,capgemini.junit.Calc_Add_Sub.class,capgemini.junit.Calc_Mul_Div.class })
public class AllTests {

}
