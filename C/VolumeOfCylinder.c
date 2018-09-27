//VOLUME OF A CYCLINDER

//Calculate and display the volume of a cylinder with height = 13 and length = 19


#include<stdio.h>


int main(void){
	
	int l = 19;
	
	int h = 13;
	
	float M_PI = 3.14;
	
	float volume = (M_PI * l * l * h) / 4;
	
	printf("%f \n", volume);
}