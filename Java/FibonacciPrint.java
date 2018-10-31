/* 13. Write a Java program to display Fibonacci series upto given
number (while, for loops).

*/

import java.lang.Math;
import java.util.Scanner;
public class FibonacciPrint{
	public static void main(String args[]){
		int n1, n2, n3, count;
		
		n1 = 0;
		n2 = 1;
		
		Scanner in =  new Scanner(System.in);
		
		System.out.println("Enter the count: ");
		count = in.nextInt();
		
		System.out.println(n1+" "+n2);
		
		for (int i=2; i<count; i++)
		{
			n3 = n1+n2;
			System.out.println(" "+n3);
			n1 = n2;
			n2 = n3;
		}
	}
}