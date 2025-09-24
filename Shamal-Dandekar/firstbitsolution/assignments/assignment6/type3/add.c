#include<stdio.h>

// function declaration (prototype)
void addNumbers(int x, int y);

void main() {
    int a = 10, b = 20;   // declaration first
    addNumbers(a, b);     //function call
}

// function definition at the bottom
void addNumbers(int x, int y) {
    int c = x + y;
    printf("Sum = %d\n", c);
}
