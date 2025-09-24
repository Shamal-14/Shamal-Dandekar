#include<stdio.h>
void main(){
    int marks1,marks2,marks3,marks4,marks5;
    marks1=10,marks2=20,marks3=30,marks4=40,marks5=50;
    int total=marks1+marks2+marks3+marks4+marks5;
    float prcntg=(total/500.0)*100;
    printf("The total: %d \n The percentages:%f",total,prcntg);
}
