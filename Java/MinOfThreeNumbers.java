/* Write a Java Program to take the three 
numbers and find minimum */

import java.lang.Math;
import java.util.Scanner;

public class MinOfThreeNumbers{
	public static void main(String args[]){
		int x, y, z, min;

		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		min = Math.min(Math.min(x,y),z);
	
		System.out.println("The Maximum of the numbers entered is "+min);	
	}
}