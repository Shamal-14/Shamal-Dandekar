#include<stdio.h>
void main(){
    int a=10,b=15,c=20;
    if(a>b)
    {
        printf("a is greater");
    }
    else{
        if(a>c)
        {
            printf("a is greater");
        }
        else{
            if(b>c){
                printf("b is greater");
            }
            else{
                printf("c is greater");
            }
            
        }
    }
    
}