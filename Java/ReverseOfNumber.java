/*
22. Write a Java program to display the reverse of a given
number (while, for loops).

*/

import java.util.Scanner;

public class ReverseOfNumber{
	public static void main(String args[]){
		
		int n , s = 0, count = 0, temp = 0, y = 0;
			
			Scanner in = new Scanner(System.in);
			
			n = in.nextInt();
			
			while( n > 0){
				
				s = s + n % 10;
				
				
				
				System.out.println( n % 10);
				
				
				
				n = n / 10;
				
				temp = (temp * 10) + (n * 10);
				
				count++;
				
				
			}
			
			
			
			System.out.println("The number of digits is : "+count);
			System.out.println("The sum of digits is : "+s);
			System.out.println("The reversed number is: "+temp);
	}
}