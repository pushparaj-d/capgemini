package capgemini.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("IGATE", "GLOBAL", "SOLUTIONS");
		System.out.println("First method-> mapping stream");
		List<Integer> counts = words.stream().map(str -> str.length()).collect(Collectors.toList());
		System.out.println(counts);
		System.out.println("Second method-> mapping stream");
		 words.stream().map(str -> str.length()).forEach(System.out::println);
		// Predicate<>predicate=new Predicate<>();

		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		// OBTAINING A STREAM
		IntStream stream = Arrays.stream(a);
		// CONSUMER TO LAMBDA EXPRESSION
		stream.forEach((value) -> System.out.println(value));
		System.out.println("filtering:");
		int[] b = { 10, 20, 30, 30, 40, 20, 90 };
		IntStream stream1 = Arrays.stream(b);
		stream1.distinct().forEach((value) -> System.out.println(value));
		System.out.println("LIMITING:");
		int[] C = { 11, 23, 20, 40, 34, 20, 95 };
		IntStream stream2 = Arrays.stream(C);
		stream2.distinct().limit(3).forEach(System.out::println);
		// PRINT COUNT
		IntStream stream3 = Arrays.stream(C);
		long count = stream3.count();
		System.out.println("Count=" + count);
		// PRINT EVEN NUMBER
		System.out.println("EVEN NUMBERS IN ARRAY:");
		IntStream stream4 = Arrays.stream(C);
		stream4.filter((value) -> value % 2 == 0).forEach(System.out::println);
		// PRINT ODD NUMBER
		System.out.println("ODD NUMBERS IN ARRAY:");
		IntStream stream5 = Arrays.stream(C);
		stream5.filter((value) -> value % 2 != 0).forEach(System.out::println);
		// PRINT MINIMUM
		System.out.println("MINIMUM VALUE IN ARRAY:");
		IntStream stream6 = Arrays.stream(C);
		stream6.sorted().limit(1).forEach(System.out::println);
		//PRINT MAXIMUM
		System.out.println("MAXIMUM VALUE IS ARRAY:");
		IntStream stream7 = Arrays.stream(C);
		Optional<Integer> opmax=stream7.max((n,m)->(n>m?1:m>n?-1:0));
		System.out.println(opmax.get());
		IntStream stream8 = Arrays.stream(C);
		Comparator<Integer> compmax=(n,m)->(n>m?1:m>n?-1:0);
		Optional<Integer> optional= stream8.ma(compmax);
		System.out.println(opmax.get());
	}

}
