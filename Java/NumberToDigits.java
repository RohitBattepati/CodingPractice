/*
Write a Java program to accept a number and print its digits
(while, for loops).
*/

import java.util.Scanner;

public class NumberToDigits{
	public static void main( String args[]){
		
			int n;
			
			Scanner in = new Scanner(System.in);
			
			n = in.nextInt();
			
			while( n > 0){
				System.out.println( n % 10);
				n = n / 10;
			}
	}
}