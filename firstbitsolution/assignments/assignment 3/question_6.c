#include<stdio.h>
void main(){
    int num,i,sum=0;
    printf("enter a number:");
    scanf("%d",&num);
    i=1;
    while (i<=num/2)
    {
        if (num%i==0){
            sum=sum+i;
            
        }
        i++;
    }
    
    if(sum==num){
        printf("perfect number");

    }
    else{
        printf("not a perfect no.");
    }
    
    
}