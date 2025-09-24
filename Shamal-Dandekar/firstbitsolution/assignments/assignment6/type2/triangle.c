#include<stdio.h>
float trarea();//function definition
void main(){

    float a=trarea();//function call
    printf("The area of triangle is:%f",a);
}
float trarea()//function declaration
{
    float base=7.15;
    float height=8.15;
    float area=0.5*(base*height);
    return area;
}