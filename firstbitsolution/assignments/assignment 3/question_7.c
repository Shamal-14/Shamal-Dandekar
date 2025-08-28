#include<stdio.h>
void main(){
    int i=1,fact=1,n=5;
    while (i<=n)
    {
        fact=fact*i;
        i++;
    }
    printf("factorial of no.is%d",fact);
    
}