package capgemini.junit;

import static org.junit.Assert.*;

import java.util.regex.Pattern;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=Parameterized.class)
public class Paramertarized_test {
@Parameter
public String domain_name;
@Parameters(name="{index}:testdomain-{0}")
public static Object[] data(){
	return new Object[]{"google.com","facebook.com","twitter.com"};
}
@Test
public void test_valid_domain(){
	assertThat(DomainUtil.isValid(domain_name),is(true));
}
}
class DomainUtil{
	private static final String domain_name_pattern="^((?!-)[A-Za-z0-9]{1,63}(?<!-)\\.)+[A-Za-z]{2,6}$";
	private static Pattern pdomainname=Pattern.compile(domain_name_pattern);
	public static boolean isValid(String domain_name){
	return pdomainname.matcher(domain_name).find();	
	}
}
