import java.util.Scanner;

public class SwapNumbers
{
	public static void main(String[] args)
	{
		int x , y , t;
		
		System.out.println("Enter the values for x and y");
		
		Scanner in = new Scanner(System.in);
		
		x = in.nextInt();
		y = in.nextInt();
		
		System.out.println("Entered Numbers are : "+x+" and "+y+" ; ");
		
		t = x;
		
		x = y;
		
		y = t;
		
		System.out.println("Numbers after swapping are: "+x+" and " +y+" ; ");




	}
}