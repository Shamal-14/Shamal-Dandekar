#include<stdio.h>
void main(){
    int no=45678,sum=0,r1;
    while (no>0)
    {
        r1=no%10;
        no=no/10;
        sum=sum+r1;     

    }  
    printf("sum of no:%d",sum);

}