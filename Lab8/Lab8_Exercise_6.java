package Lab8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab8_Exercise_6 {
	public static void calcDate(LocalDate desiredDate){
		LocalDate currentdate=LocalDate.now();
		System.out.println("Current date:"+currentdate);
		Period period=Period.between(currentdate, desiredDate);
		System.out.println("Day:"+period.getDays()+"\tMonth:"+period.getMonths()+"\tYear"+period.getYears());
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Desired date in yyyy-mm-dd format:");
	String stringDate=s.next();
	LocalDate desiredDate=LocalDate.parse(stringDate);
	calcDate(desiredDate);
	s.close();
}
}
