#include<stdio.h>
void main(){
    int n,lastdgit,firstdgt,sum;
    printf("enter a number:");
    scanf("%d",&n);
    firstdgt=n;
    lastdgit=n%10;

    while (firstdgt>=10)
    {
        firstdgt=firstdgt/10;
    }
    sum=firstdgt+lastdgit;
    printf("sum of first and lastdgit is:%d",sum);
    
}