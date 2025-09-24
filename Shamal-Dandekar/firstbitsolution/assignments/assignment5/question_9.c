#include <stdio.h>

int main() {
    int n = 4;

    for (int i = 1; i <= n; i++) {          // loop for rows
        for (int j = 1; j <= n; j++) {      // loop for columns
            if (i == 1 || i == n || j == 1 || j == n) {
                printf("* ");
            } else {
                printf("  ");  // spaces inside
            }
        }
        printf("\n");
    }

    return 0;
}
