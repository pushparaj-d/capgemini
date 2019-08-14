package Lab9;

import java.util.HashMap;
import java.util.Scanner;

public class Lab9_Exercise_2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string:");
	String input=s.next();
	countCharacter(input);
	s.close();
}
static void countCharacter(String input)
{
	char[] c=input.toCharArray();
	HashMap<Character, Integer> hmap= new HashMap<>();
	for(char current:c){
		if(!hmap.containsKey(current)){
			hmap.put(current, 1);
		}
		else{
			hmap.put(current, hmap.get(current)+1);
		}
		
	}
System.out.println(hmap);	
}
}
