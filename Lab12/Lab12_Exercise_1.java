package Lab12;

import java.util.Scanner;
interface Finding_power{
double power(double xx,double yy);
	
}
public class Lab12_Exercise_1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double x=s.nextDouble();
	double y=s.nextDouble();
	s.close();
	Finding_power p=(double xx,double yy)->{ return Math.pow(x, y);};
	System.out.println(p.power(x, y));
}
}
