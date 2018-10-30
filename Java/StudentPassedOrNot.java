/* Write a Java program to accept student_no, student_name,
marks in three subjects. Find total marks and average and print
them. Check whether he is passed or not and display along with
grade.
Grade-average >= 80 - Distinction
average >= 60 - First Class
average >= 50 - Second Class
average >= 35 - Third Class
else - Fail

*/

import java.lang.Math;
import java.util.Scanner;

public class StudentPassedOrNot{
	public static void main(String args[]){
		
		int student_no;
		String student_name;
		
		float studentMarks1;
		float studentMarks2;
		float studentMarks3;
		
		Scanner in = new Scanner(System.in);
		
		student_no  = 	in.nextInt();
		student_name =  in.next();
		
		studentMarks1 = in.nextFloat();
		studentMarks2 = in.nextFloat();
		studentMarks3 = in.nextFloat();
		
		float total_marks = studentMarks1 + studentMarks2 + studentMarks3 ;
		float average = total_marks / 3 ;
		
		System.out.printf("Total Marks secured by the student: %f\n",total_marks);
		System.out.printf("Average of the student: %f\n", average);
		
		if (average >= 80){
			System.out.println("Distinction");
		}else if(average >= 60){
			System.out.println("First Class");
		}else if(average >= 50){
			System.out.println("Second Class");
		}else if(average >= 35){
			System.out.println("Thrid Class");
		}else{
			System.out.println("Fail");
		}		
	}
}