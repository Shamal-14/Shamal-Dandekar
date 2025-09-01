#include <stdio.h>

int main() {
    int n = 4;       // number of rows
    int num = 1;     // starting number
    
    for (int i = 1; i <= n; i++) {          // rows
        for (int j = 1; j <= i; j++) {      // numbers in each row
            printf("%d ", num);
            num++;
        }
        printf("\n");
    }
    
    
}
