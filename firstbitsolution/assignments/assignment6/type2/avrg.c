#include<stdio.h>
int avrg();
void main(){
    int a;
    a=avrg();
    printf("%d",a);
    
}
int avrg(){
    int no1,no2,no3,no4,no5;
    no1=10;
    no2=20;
    no3=30;
    no4=40;
    no5=50;
    int avrg= (no1+no2+no3+no4+no5)/5;
    return avrg;
}