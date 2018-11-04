// Write a Java program to print even numbers between 1 to 10 


public class EvenNumbers{
	public static void main(String args[]){
		int i = 2 ;
		
		while ( i <= 10){
			if( i % 2 == 0){
				System.out.println(i);	
			}
			i++;	
		}
	}
}