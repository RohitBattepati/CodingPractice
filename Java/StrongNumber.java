/*
25. Write a Java program to check whether given number is
strong number or not (while, for loops).

*/


import java.util.Scanner;

public class StrongNumber{
	public static void main(String args[]){
		
		int number, originalNum, remainder, sum = 0;
		
		System.out.println("Enter the number: ");
		
		Scanner in = new Scanner(System.in);
		
		number = in.nextInt();
		
		//storing the value in a temp variable - originalNum
		originalNum = number;
		
		while(number > 0){
			
			//taking reminder
			remainder = number % 10;
			
			//for caluculating factorial
			int fact = 1;
			
			for (int i = 1; i <= remainder; i++){
				
				fact = fact * i;
			}
					
			number = number/10;
			
			//adding the factorials
			sum = sum+fact;
		}
		
		//comparing numbers
		if(originalNum == sum){
			System.out.println("Strong Number");
		}else{
			System.out.println("Not Strong Number");
		}
	}
}