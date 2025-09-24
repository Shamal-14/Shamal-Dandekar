#include <stdio.h>

int add(int, int);
int main() {
    int num1, num2, sum;
    printf("Enter two integers: ");
    scanf("%d %d", &num1, &num2);

    sum = add(num1, num2);  // Function call
    printf("Sum = %d\n", sum);
    return 0;
}
int add(int a, int b)
{  // Function with parameters & return type
    return a + b;
}
