#include<stdio.h>
void main(){
    int no;
    printf("enter a number: ");
    scanf("%d",&no);
    if(no<0){
        printf("number is negative");
    }
    else if(no>0){
        printf("number is positive");
    }
    else{
        printf("number is neutral");
    }
}