package lab5;

import java.util.Scanner;

public class Lab5_Excercise_1 {
public static void main(String[] args) {
int choice;
Scanner s= new Scanner(System.in);
System.out.println("-----TRAFFIC LIGHT-----\n1. Red\n2. Yellow\n3. Green\nEnter your choice:");
choice=s.nextInt();
switch(choice)
{
case 1:
	System.out.println("Please stop... Red signal is diplayed");
	break;
case 2:
	System.out.println("Please be ready.. The signal is about to change.");
	break;
case 3:
	System.out.println("you can go now.");
	break;
	default:
		System.out.println("Enter the proper choice.");
}
s.close();
}
}
