#include <stdio.h>

int main() {
    int n = 5;   // size of the triangle
    
    for (int i = n; i >= 1; i--) {        // loop for rows (start from n down to 1)
        for (int j = 1; j <= i; j++) {    // loop for stars
            printf("*");
        }
        printf("\n");  
    }
    
    
}
