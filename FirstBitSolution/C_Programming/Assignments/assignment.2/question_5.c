#include<stdio.h>
void main(){
    char isstudent;
    float fprice;
    int price;

    printf("Enter student number 'y/n'\n");
    scanf(" %c",&isstudent);

    printf("Enter price:\n");
    scanf("%d",&price);

    if(isstudent=='y'){
        if(price>500){
            fprice=price-price*0.20;
        }
        else {
            fprice=price-price*0.10;
        }
        printf("The Discount is:%.2f",fprice);
        
    }
     else if(isstudent=='n'){
        if(price >600){
            fprice=price-price*0.20;
            printf("The total discount is:%.2f",fprice);
        }
        else{
            printf("there is no discount");
        }

    
    }
    else{
            printf("invadlid input");
        } 
    
    
    
    }