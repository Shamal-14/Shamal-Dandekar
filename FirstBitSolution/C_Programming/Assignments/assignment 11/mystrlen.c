#include <stdio.h>

// function declaration
int mystrlen(char str[]);

int main() {
    char str[] = "Hello World";

    int length = mystrlen(str);  // call user-defined function

    printf("Length of string = %d\n", length);

    return 0;
}

// function definition
int mystrlen(char str[]) {
    int i = 0;
    while (str[i] != '\0') {  
        i++;
    }
    return i; 
}