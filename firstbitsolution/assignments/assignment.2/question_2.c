#include<stdio.h>
void main(){
      int s1,s2,s3;
      printf("Enter s1");
      scanf("%d",&s1);
      printf("enter s2");
      scanf("%d",&s2);
      printf("enter s3");
      scanf("%d",&s3);

      if (s1==s2&&s2==s3){
        printf("The triangle is equilateral");
      }
      else if(s1==s2|| s1==s3||s2==s3){
        printf("The triangle is isoscesles ");
      }
      else{
        printf("The triangle is scalane ");
      }
}