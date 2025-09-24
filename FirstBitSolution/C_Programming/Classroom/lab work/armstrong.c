#include<stdio.h>
void main(){
	 int n = 153;  
	 int digit; 
int original = n;//put n in origin
int sum = 0;

while(n > 0) {
 digit = n % 10;  //to get last digit      
    sum = sum + (digit * digit * digit); //formula for armstrong no.
    n = n / 10; //inc
}    //ends here           

if(sum == original)
    printf("Armstrong number");
else
    printf("Not Armstrong number");

}
