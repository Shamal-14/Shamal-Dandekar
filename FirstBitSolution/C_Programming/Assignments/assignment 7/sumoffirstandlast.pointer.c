#include <stdio.h>

void sumFirstLast(int*);
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    sumFirstLast(&n);
    return 0;
}
void sumFirstLast(int*n)
 {
    int last = *n % 10;
    int first = *n;

    while (first >= 10) {
        first /= 10;
    }

    printf("Sum of first and last digit: %d\n", first + last);
}
