#include<stdio.h>
void mystrrev(char str[]){
    int i=0,j;
    char temp;
    while (str[i] !='\0'){
        i++;
    }
    j=i-1;//to get last index

    i=0;
    while(i<j){
        temp =str[i];
        str[i]=str[j];
        str[j]=temp;
        i++;
        j--;
    }

}
int main(){
    char s[20];
    printf("enter a string:");
    scanf("%s",s);
    mystrrev(s);
    printf("reversed string:%s\n",s);
}


