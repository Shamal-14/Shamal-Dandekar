#include<stdio.h>
void swap();
int main()
{
    swap();
}
void swap(){
    int a=10;
    int b=20;
    int c;
    c=a;
    a=b;
    b=c;
    printf("a=%d,b=%d",a,b);

}