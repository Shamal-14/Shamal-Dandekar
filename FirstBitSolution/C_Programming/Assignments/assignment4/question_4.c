#include <stdio.h>

int main() {
    int n, temp, rem, sum = 0, i, fact;
    n = 145;
    temp = n;   // store original value

    while (n) {
        i = 1;
        fact = 1;
        rem = n % 10;

        while (i <= rem) {
            fact = fact * i;
            i++;
        }

        sum = sum + fact;
        n = n / 10;
    }

    if (sum == temp)   // compare with original number, not reduced n
        printf("Number is Strong\n");
    else
        printf("Number is not Strong\n");

    return 0;
}
