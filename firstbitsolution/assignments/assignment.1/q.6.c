#include<stdio.h>
void main(){
     {
    int ch = getchar();  
    if (ch >= 'A' && ch <= 'Z')
        printf("'%c' is uppercase.\n", ch);
    else if (ch >= 'a' && ch <= 'z')
        printf("'%c' is lowercase.\n", ch);
    else
        printf("'%c' is not an alphabet letter.\n", ch);

    return 0;
}

}