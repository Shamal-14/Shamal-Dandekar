#include<stdio.h>

// function declaration (prototype)
void convertTemp(int c);

void main() {
    int c = 10;             
    convertTemp(c);         // function call with parameter
}


void convertTemp(int c) {
    int f = (c * 9 / 5) + 32;
    printf("Fahrenheit: %d\n", f);
}
