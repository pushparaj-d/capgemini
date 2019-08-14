package capgemini.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sample3 {
public static void main(String[] args) {
	List<String> cities= new ArrayList<>();
	cities.add("pune");
	cities.add("pune");
	cities.add("bangalore");
	cities.add("mumbai");
	cities.add("mumbai");
	System.out.println("LIST VALUES");
	cities.stream().forEach(System.out::println);
	System.out.println("DISTINCT VALUES:");
	cities.stream().distinct().forEach(System.out::println);
	System.out.println("STORING DISTING VALUES IN LIST:");
	List<String>c=cities.stream().distinct().collect(Collectors.toList());
	System.out.println(c);
	List<String>cc=cities.stream().collect(Collectors.toList());
	System.out.println(cc);
	Set<String> ccc=(Set<String>) cities.stream().collect(Collectors.toList());
	System.out.println(ccc);
}
}
