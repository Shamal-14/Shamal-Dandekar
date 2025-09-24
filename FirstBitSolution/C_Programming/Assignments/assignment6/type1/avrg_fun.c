#include<stdio.h>
void avrg();
void main(){
    avrg();
}
void avrg(){
    int no1,no2,no3,no4,no5;
    no1=10;
    no2=20;
    no3=30;
    no4=40;
    no5=50;
    int avrg= (no1+no2+no3+no4+no5)/5;
    printf("Average of 5 no. is %d",avrg);
}