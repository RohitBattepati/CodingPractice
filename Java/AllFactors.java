//16.Write a Java program to enter a number and display all its
//factors

import java.util.Scanner;

public class AllFactors{
	public static void main(String args[]){
		
		int n;
		
		System.out.println("Enter the number that you want to find factors for: ");
		
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		
		int i = 1;
		
		while (i < n){
			if (n % i == 0){
				System.out.println(i);
			}
			i++;
		}
		
		/*
		for (int i = 1;i < n ;i++){
			if( n % i == 0){
				System.out.println(i);
			}
		}
		*/
		
	}
}