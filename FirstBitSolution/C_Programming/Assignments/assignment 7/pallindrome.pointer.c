#include <stdio.h>

void checkPalindrome(int*);
int main()
{
    int number;
    printf("Enter a 3-digit number: ");
    scanf("%d", &number);
    checkPalindrome(&number);
    return 0;
}
void checkPalindrome(int *num)
{
    if (*num < 100 || *num > 999)
    {
        printf("Error: Please enter a 3-digit number.\n");
        return;
    }

    int temp = *num, reversed = 0, digit;

    while (*num > 0)
    {
        digit = *num % 10;
        reversed = reversed * 10 + digit;
        *num = *num / 10;
    }

    if (temp == reversed)
        printf("%d is a Palindrome number.\n", temp);
    else
        printf("%d is NOT a Palindrome number.\n", temp);
}
