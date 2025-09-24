#include <stdio.h>

void checkVotingEligibility(int*);
int main()
{
    int age;
    printf("Enter your age: ");
    scanf("%d", &age);
    checkVotingEligibility(&age);
    return 0;
}
void checkVotingEligibility(int* age)
{
    if (*age >= 18)
        printf("You are eligible to vote.\n");
    else
        printf("You are NOT eligible to vote.\n");
}

