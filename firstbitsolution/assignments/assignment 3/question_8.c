#include<stdio.h>
void main(){
    int n,i;
    printf("enter a number to check strong or not:");
    scanf("%d",&n);
    int temp=n,sum=0;
    int digit,fact;
    while (temp>0)
    {
        digit=temp%10;//to extract last digit
         fact=1;
         i=1;
         while (i<=digit)
         {
            fact=fact*i;
            i++;
         }
          sum=sum+fact;
          temp=temp/10;
    }
    if(sum==n){
        printf("strong number");
    }
    else{
        printf("not a strong number");
    }

}