/* 8. Write a Java program to take the four numbers as a input and find
maximum. */

import java.util.Scanner;
import java.lang.Math;

public class MaxOfFourNumbers{
	public static void main(String args[]){
		int a, b, c, d, max;
		
		Scanner in = new Scanner(System.in);
		
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		
		max = Math.max(Math.max(a,b),Math.max(c,d));
		
		System.out.println("Max number of Four numbers entered is: "+max);
		
	}
}