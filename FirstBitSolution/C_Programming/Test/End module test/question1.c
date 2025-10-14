#include<stdio.h>
int main(){
    int n,i;
    int fact=1,sum=0;
    printf("enter n:");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        fact =fact*i;
        sum=sum+fact;//add i! to sum
    }
    printf("sum of series 1!+2!+3!+....%d!=%d\n",n,sum);
}