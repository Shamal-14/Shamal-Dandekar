#include<stdio.h>
void main(){
    for(int start=10;start<25;start++){
        if(start%2!=0){
            
            printf("odd %d\n",start);
        }
    }
    for(int start=1;start<15;start++){
        if(start%2==0){
            
            printf("even %d\n",start);
        }

}
}