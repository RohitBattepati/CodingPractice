// Use heroes formula for calculating the area of triangle with sides 4 ,7, 10. 

// heroes formula = sqrt ( s(s-a)(s-b)(s-c)

//where s = a+b+c/2


#include<stdio.h>
#include<math.h>

int main(void){
	
	int a = 4;
	
	int b = 7;
	
	int c = 10;
	
	
	int s (){
		(a+b+c)/2 ;
		return s;
	}
	
	
	
	float area = sqrt(s(s-a)(s-b)(s-c));
	
	printf("%i \n", area);
}