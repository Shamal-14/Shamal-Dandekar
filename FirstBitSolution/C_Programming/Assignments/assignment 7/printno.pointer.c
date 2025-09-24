#include <stdio.h>

void printNumbers(int*);  // Function declaration

void main() {
	int num;
	printf("Enter a number: ");
    scanf("%d", &num);
    printNumbers(&num);   // Function call with parameter
}

void printNumbers(int* num) {  // Function definition
    for (int i = 1; i <= *num; i++) {
        printf("%d ", i);
    }
}