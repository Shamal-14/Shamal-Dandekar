#include <stdio.h>

int main() {
    int n = 5;   // height of the pyramid
    
    for (int i = 1; i <= n; i++) {        // rows
        for (int j = 1; j <= i; j++) {    // numbers in each row
            printf("%d", j);
        }
        printf("\n");
    }
    
    
}
