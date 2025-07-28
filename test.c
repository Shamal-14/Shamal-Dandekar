#include<stdio.h>
void main(){
int hr,min,sec;
int totalsecond;
hr=2;
min=3;
sec=10;
printf("%d %d %d",hr,min,sec);
totalsecond=(hr*3600+min*60+sec);
printf("totalseconds =%d",totalsecond);
}