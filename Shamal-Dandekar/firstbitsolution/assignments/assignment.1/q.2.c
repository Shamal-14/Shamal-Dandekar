#include <stdio.h>

int main(void) {
    int n = 121;  

    if (n == (n / 100) * 100 + (n % 10) * 1 + (n / 10 % 10) * 10){
        printf("%d is a palindrome.\n", n);
    }
    else
        printf("%d is not a palindrome.\n", n);

    return 0;
}
