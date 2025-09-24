#include<stdio.h>
void main()
{
    int a=10;
    int b=20;
    int c;
    c=a;
    a=b;
    a=c;
    printf("a=%d,b=%d",a,b);
}