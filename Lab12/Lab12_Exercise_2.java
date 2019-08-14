/*Exercise 2: Write a method that uses lambda expression to format a given string,
 *  where a space is inserted between each character of string. For ex., if input 
 *  is “CG”, then expected output is “C G”.
 *  WRITTEN BY- PUSHPARAJ.D
 *  EMP ID-190012*/

package Lab12;

import java.util.Scanner;
import java.util.function.Consumer;

public class Lab12_Exercise_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER THE STRING:");
		String string = s.next();
		System.out.println("FORMATTED STRING:");
		// USING CONSUMER INTERFACE TO FORMAT HTE GIVEN STRING
		Consumer<Character> consumer = (a) -> {
			System.out.print(a);
			System.out.print(" ");
		};
		for (int i = 0; i < string.length(); i++) {
			char[] c = string.toCharArray();
			consumer.accept(c[i]);
		}
		s.close();
	}
}
