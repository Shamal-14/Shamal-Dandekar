#include<stdio.h>
void main(){
    int n,original,remainder,reversed=0;
    printf("enter a number:");
    scanf("%d",&n);
    original=n;

    while (n!=0)
    {
        remainder=n%10;
        reversed =reversed*10+remainder;                                                      
        n=n/10;
    }
    if(original==reversed){
        printf("no. is pallindrome");
    }
    else printf("not pallindrome");
}