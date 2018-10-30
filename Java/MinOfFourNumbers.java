/* Write a Java program to take the four numbers as a input and find
minimum. */

import java.lang.Math;
import java.util.Scanner;

public class MinOfFourNumbers{
	public static void main(String args[]){
		int a,b,c,d,min;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		
		min = Math.min(Math.min(a,b),Math.min(c,d));
		
		System.out.println("The min of four numbers entered is: "+min);
	}
}