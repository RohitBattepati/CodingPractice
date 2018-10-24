import java.util.Scanner;

public class AddInputs3{
	
	public static void main(String args[]){
		
		int x , y , sum;
		
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		sum = x+y;
		
		System.out.printf("the sum of the numbers is : "+sum);
	}
}