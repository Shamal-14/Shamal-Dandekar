#include <stdio.h>

void checkLeapYear(int*);
int main()
{
    int year;
    printf("Enter a year: ");
    scanf("%d", &year);
    checkLeapYear(&year);
    return 0;
}
void checkLeapYear(int *year)
{
    if ((*year % 4 == 0 && *year % 100 != 0) || (*year % 400 == 0))
        printf("%d is a Leap Year.\n", *year);
    else
        printf("%d is not a Leap Year.\n", *year);
}
