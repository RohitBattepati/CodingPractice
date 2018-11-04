//34. Write a Java program to display all even numbers below 20 using
//for loop.

public class EvenNumbersNew{
	public static void main(String args[]){
		System.out.println("Even numbers below 20 are: ");
	
		for (int i =2; i < 20; i=i+2){
			
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	}
}