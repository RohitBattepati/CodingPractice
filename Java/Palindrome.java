/* 23 . Write a Java program to check whether given number is
palindrome or not (while, for loops).
*/

import java.util.Scanner;

public class Palindrome{
	public static void main(String args[]){
		
		int i , j = 0, remainder, originalInteger;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		i = in.nextInt();
		
		originalInteger = i;
		
		//reversed integer is stored in variable
		while ( i != 0){
			
			remainder = i % 10;
			
			j = j * 10 + remainder;
			
			i = i / 10;
		}
		
		
		//checking if reversed number is equal to original number
		if ( originalInteger == j){
			System.out.println("Entered number is a palindrome");
		}else{
			System.out.println("Enter number is not a palindrome");
		}


		
		
		
	}
}