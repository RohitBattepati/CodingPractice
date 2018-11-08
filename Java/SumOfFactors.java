//Write a Java program to find total of all factors of given
//number (while, for loops).

import java.util.Scanner;

public class SumOfFactors{
	public static void main(String args[]){
		
		int n , count = 0, sum = 0;
		System.out.println("Enter the number that you want to find factors for: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 1;i <= n ;i++){	
			if( n % i == 0){	
				count++;
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("The number of factors for the given numbers is: "+count);
		System.out.println("The Sum of the Factors of the given number is : "+sum);
	}
}