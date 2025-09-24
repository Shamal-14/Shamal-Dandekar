#include<stdio.h>
void main(){
    int units;
    printf("enter units : ");
    scanf("%d",&units);
    if(units>=1&&units<=50){
        printf("30 rs");
    }
    else if(units>=51&&units<=150){
        printf("40 rs");
    }
    else{
        printf("50 rs");
    }
}