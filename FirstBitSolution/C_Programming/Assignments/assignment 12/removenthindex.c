#include<stdio.h>
#include<string.h>
int main(){
    char str[20];
    int n,length;
    printf("enter a string:");
    scanf("%s",str);
     
    printf("enter the index to remove:" );
    scanf("%d",&n);

    length=strlen(str);
    if (n<0 || n>=length){
        printf("invalid index");
    }
    else {
        for(int i=n;i<length;i++){
            str[i]=str[i+1];
        }
        printf("modifiend string: %s",str);

    }


}