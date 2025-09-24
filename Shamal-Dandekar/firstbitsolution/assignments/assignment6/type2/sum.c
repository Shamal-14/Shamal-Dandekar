#include<stdio.h>
int sum();
void main()
{
    int a;
    a=sum();  
    printf("%d",a) ;

}
int sum(){
    int a,b;
    a=10;
    b=20;
    int c=a+b;
    return c;
}