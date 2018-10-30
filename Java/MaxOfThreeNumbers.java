/* 6 .Write a Java Program to take the three
numbers and find maximum */

import java.lang.Math;
import java.util.Scanner;

public class MaxOfThreeNumbers{
	public static void main(String args[]){
		int x, y, z, max;

		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		max = Math.max(Math.max(x,y),z);
	
		System.out.println("The Maximum of the numbers entered is "+max);	
	}
}