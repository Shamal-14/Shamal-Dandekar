#include<stdio.h>
float prmtr(); //function declaration
void main(){
    float a;
    a=prmtr();// function call
    printf("The perimeter of this rectangle is:%f",a);
    
}
float prmtr()// function definition
{
    float length=7.15;
    float width=4.15;
    float prmtr=(length+width)*2;
    return prmtr;
}