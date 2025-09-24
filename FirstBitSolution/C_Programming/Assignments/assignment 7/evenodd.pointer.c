#include <stdio.h>

// Function declaration: takes an integer, returns nothing
void checkEvenOdd(int*);

int main()
{
    int number;

    // Input from user
    printf("Enter a number: ");
    scanf("%d", &number);

    // Function call with parameter
    checkEvenOdd( &number);

    return 0;
}

// Function definition
void checkEvenOdd(int *num)
{
    if (*num % 2 == 0)
    {
        printf("%d is Even.\n", *num);
    }
    else
    {
        printf("%d is Odd.\n", *num);
    }
}