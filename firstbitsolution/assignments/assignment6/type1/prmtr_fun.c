#include<stdio.h>
void prmtr();
void main(){
    prmtr();
}
void prmtr(){
    float length=7.15;
    float width=4.15;
    float prmtr=(length+width)*2;
    printf("The perimeter of this rectangle is:%f",prmtr);
    
}