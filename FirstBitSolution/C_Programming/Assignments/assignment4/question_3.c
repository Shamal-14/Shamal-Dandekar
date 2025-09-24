#include<stdio.h>
void main(){
    int number;
    printf("enter a number:");
    scanf("%d",&number);
    int i,rem,sum;
    for(i=1;i<number;i++){
        rem=number%i;
        if(rem==0){
            sum=sum+i;
        }
    }
    if(sum==number){
        printf("no. is perfect");
    }else printf("no. is not perfect");



}