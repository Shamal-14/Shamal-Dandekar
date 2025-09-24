#include <stdio.h>

int main() {
    int n, i;

    // Take size of array
    printf("Enter number of elements in array: ");
    scanf("%d", &n);

    int arr[n];

    // Input elements
    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Print Even numbers
    printf("Even numbers in array: ");
    for(i = 0; i < n; i++) {
        if(arr[i] % 2 == 0) {
            printf("%d ", arr[i]);
        }
    }

    // Print Odd numbers
    printf("\nOdd numbers in array: ");
    for(i = 0; i < n; i++) {
        if(arr[i] % 2 != 0) {
            printf("%d ", arr[i]);
        }
    }

    printf("\n");
    
}