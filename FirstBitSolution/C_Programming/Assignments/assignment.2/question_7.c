#include<stdio.h>
void main(){
    int age;
    printf("Enter age:");
    scanf("%d",&age);
    if (age<=12)
    {
       printf("child");
    }
    else if(age>12&&age<=19){
        printf("Tenager");
    }
    else if(age>=20&&age<=59){
        printf("Adult");
    }
    else if(age>=60){
        printf("senior");
    }
    else{
        printf("invalid age");
    }
    
}