#include<stdio.h>
void main(){
    int no;
    printf("enter a number");
    scanf("%d",&no);
    int i,isPrime=1;
    if(no<=1){
        isPrime=0;
    }
    else{

    for(i=2;i<=no/2;i++){
        if (no%2==0)
        {
            isPrime=0;
            break;
        }
    }
    

    if (isPrime=0)
    {
        printf("no. is prime");
    }
    else printf("not prime");
}
}
