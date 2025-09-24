#include<stdio.h>
void main(){
    int no ,temp,rev=0;
    printf("enter a number:");
    scanf("%d",&no);
    temp=no;
    while (temp>0)
    
    {
        
        int digit=temp%10;
        rev=rev*10+digit;
        temp=temp/10;
        
        
    }
    if (no==rev){
            printf("no. is panlindrome");

        }
        else{
            printf("no. is not pandrome");
        }
        
    
}