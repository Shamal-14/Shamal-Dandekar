#include<stdio.h>
#include<string.h>
int main(){
    char str[50];
    int i,j=0;
    printf("enter a string:");
    scanf("%[^\n]",str);

    for(i=0;str[i] !='\0';i++){
        if (i%2==0){
            str[j]=str[i];
            j++;
        }
    }
    str[j]='\0';
    printf("modified string:%s",str);

}