#include<stdio.h>
int celfar();
void main(){
    int x;
    x=celfar();
    printf("%d",x);
    
}
int celfar(){
    int c=10;
    int f;
    int res=(c*9/5+32);
    return res;
}