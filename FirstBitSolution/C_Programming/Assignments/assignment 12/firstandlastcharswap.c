#include<stdio.h>
#include<string.h>
int main(){
    char str[20];
    int length;
    char temp;

    printf("enter a string:");
    scanf("%s",str);
     length=strlen(str);
     if (length>1){
        temp=str[0];
        str[0]=str[length-1];
        str[length-1]=temp;

     }
     printf("modified string:%s",str);


}