/*
Write a Java program to accept the age of the person and
check whether he is eligible for voting or not

*/

import java.util.Scanner;

public class VoteOrNot{
	public static void main(String args[]){
		
		int age;
		
		Scanner in = new Scanner(System.in);
			
			age = in.nextInt();
			
			if(age >= 18){
				System.out.println("Person can vote!");
			}else{
				System.out.println("Person cannot vote!");
			}
		
	}
}