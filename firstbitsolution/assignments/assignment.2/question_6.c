#include<stdio.h>
void main(){
    int no;
    printf("Enter a number:\n");
    scanf("%d",&no);
    if (no%3==0 && no%5==0){
        printf("no. is divisile by both");
    }
    else if( no%3==0 && no%5!=0){
        printf("no. is divisible by 3 but not 5");
    }
    else if (no%3!=0 && no%5==0){
        printf("no. is divisible by 5 but not 3");
    }
    else{
        printf("no.is not divisib by both");
    }
}