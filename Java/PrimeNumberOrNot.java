/* 
26. Write a Java program to check whether given number is
prime number or not (while, for loops).
*/

import java.util.Scanner;

public class PrimeNumberOrNot{
	public static void main(String args[]){
		
		int num, count=0;
		
		System.out.println("Enter a number: ");
		
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
			
			//for loop for multipying the number starting from 1
			for(int i=1; i<= num; i++){
				
					if (num % i == 0){
						count ++;
					}
			}	
			
			// counting the number of factors, if greater than 2 then its not a prime number and vice versa
			if ( count <= 2){
				System.out.println("Entered number is a prime number");
			}else{
				System.out.println("Entered number is not a prime number.");
			}
	
	}
}