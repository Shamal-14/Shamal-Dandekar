#include<stdio.h>
void main(){
    int no,originNum,remainder;
    int sum=0;
    printf("enter a 3-digit number:");
    scanf("%d",&no);

    
    for (originNum=no;originNum!=0;)
    {
        remainder=originNum%10;//stores the last digit of the number.
        sum=sum+(remainder*remainder*remainder);
        originNum=originNum/10;
    }
    if (sum==no){
        printf("The number is armstrong");

    }
    else{
        printf("The number is not armstrong");
    }
    
}