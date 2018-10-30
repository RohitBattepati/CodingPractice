/* Write a Java program to take the two numbers and find out
minimum of them. */

import java.util.Scanner;

public class MinOfNumbers{
	public static void main(String args[]){
		int x , y , min;
		
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		if ( x < y){
			System.out.println("The min of two numbers is: "+x);
		}else if(y < x){
			System.out.println("The max of two numbers is: "+y);
		}else{
			System.out.println("Not Defined!");
		}
	}
}