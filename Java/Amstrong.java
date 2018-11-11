/* 24. Write a Java program to check whether given number is
Armstrong or not (while, for loops). 
*/


import java.util.Scanner;

public class Amstrong{
	public static void main(String args[]){
		
		int givenNumber, finalNumber = 0 ,remainder , originalNumber;
		
		System.out.println("Enter the number: ");
		
		Scanner in = new Scanner(System.in);
		
		givenNumber = in.nextInt();
		
		originalNumber = givenNumber;
		
		
		//storing the reversed number and taking cube of the number
		while( givenNumber != 0){
			
			remainder = givenNumber % 10;
			
			//Armstrong Number logic
			finalNumber = finalNumber + (remainder*remainder*remainder);
			
			System.out.println(finalNumber);
			
			givenNumber = givenNumber / 10;
			
		}
	
		//checking if final number is equal to the given number
		if(finalNumber == originalNumber){
			System.out.println("Given number is a Armstrong Number");
		}else{
			System.out.println("Given number is not a Armstrong Number");
		}

	
	}
}