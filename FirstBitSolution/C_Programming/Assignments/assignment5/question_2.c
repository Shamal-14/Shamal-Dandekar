#include <stdio.h>

int main() {
    int n = 5;   
    for (int i = 1; i <= n; i++) {        // loop for rows
        for (int j = 1; j <= i; j++) {    // loop for columns
            printf("*");
        }
        printf("\n");   
    }
    
    
}
