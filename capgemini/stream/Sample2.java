package capgemini.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sample2 {
public static void main(String[] args) {
	List<String> words = Arrays.asList("IGATE", "GLOBAL", "SOLUTIONS");
	System.out.println("First method-> mapping stream");
	List<Integer> counts = words.stream().map(str -> str.length()).collect(Collectors.toList());
	System.out.println(counts);
//	System.out.println("Second method-> mapping stream");
//	 words.stream().map(str -> str.length()).forEach(System.out::println);
	words.stream().map(String::length).forEach(System.out::println);
	List<Integer> list=Arrays.asList(10,21,23,50,53);
	Optional<Integer> result=list.stream().filter((a)->a>0).reduce((a,b)->a>b?a:b);
	if(result.isPresent()){
		System.out.println("Result:"+result);
	}
}
}
class City{
	String name;

	public City(String name) {
		super();
		this.name = name;
	}
	
}
