/* 
20. Write a Java program to accept a number and count number
of digits (while, for loops).
*/


import java.util.Scanner;

public class CountOfDigits{
	public static void main(String args[]){
		
		int n , count = 0;
			
			Scanner in = new Scanner(System.in);
			
			n = in.nextInt();
			
			while( n > 0){
				System.out.println( n % 10);
				n = n / 10;
				count++;
			}
			
			System.out.println("The number of digits is : "+count);
	}
}