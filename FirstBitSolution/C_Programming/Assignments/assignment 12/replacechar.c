#include <stdio.h>
#include<stdio.h>
int main(){
    char str[20];
    int i;
    printf("enter a string: ");
    scanf("%s",str);
    for(int i=0;str[i]!='\0';i++){
        if(str[i]=='a'){
            str[i]='$';
        }
    }
    printf("modified string:%s\n",str);
    
}