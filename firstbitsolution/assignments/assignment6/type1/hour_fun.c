#include<stdio.h>
void hour();
void main(){
    hour();
}
void hour(){
    int min =90;
    int hour=min/60;
    int min_left=min%60;
    printf("%d Hour %d Min",hour,min_left);

}