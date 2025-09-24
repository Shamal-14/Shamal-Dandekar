#include <stdio.h>

int main() {
    int n = 5;

    for (int i = 1; i <= n; i++) {          // loop for rows
        for (int j = 1; j <= n; j++) {      // loop for columns
            if (i == 1 || i == n || j == 1 || j == n || i == j) {
                printf("* ");
            } else {
                printf("  ");
            }
        }
        printf("\n");
    }

    return 0;
}
