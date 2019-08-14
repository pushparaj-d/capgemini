package capgemini.stream;

import java.util.function.IntConsumer;

public class My_Stream {
	@FunctionalInterface
	public interface Consumer<T> {
		void accept(int[] a);
	}

	public static void main(String[] args) {
		// generate an int array of 10
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		// System.out.println(Arrays.toString(a));
		System.out.println("......USING LAMBDA EXPRESSION......");
		IntConsumer consumer = (t) -> System.out.println(t);
		for (int i = 0; i < a.length; i++) {
			consumer.accept(a[i]);
		}
		System.out.println("......USING METHOD INTERFACE......");
		IntConsumer consumer2=System.out::println;
		for (int i = 0; i < a.length; i++) {
			consumer2.accept(a[i]);
		}
	}
}
