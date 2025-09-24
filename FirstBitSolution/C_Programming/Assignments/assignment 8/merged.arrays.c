#include <stdio.h>

int main() {
    int n1, n2, i, j;

    // Input sizes of both arrays
    printf("Enter number of elements in first array: ");
    scanf("%d", &n1);
    printf("Enter number of elements in second array: ");
    scanf("%d", &n2);

    int arr1[n1], arr2[n2], merged[n1 + n2];

    // Input first array
    printf("Enter %d elements of first array:\n", n1);
    for(i = 0; i < n1; i++) {
        scanf("%d", &arr1[i]);
    }

    // Input second array
    printf("Enter %d elements of second array:\n", n2);
    for(i = 0; i < n2; i++) {
        scanf("%d", &arr2[i]);
    }

    // Copy arr1 into merged
    for(i = 0; i < n1; i++) {
        merged[i] = arr1[i];
    }

    // Copy arr2 into merged
    for(j = 0; j < n2; j++) {
        merged[i + j] = arr2[j];
    }

    // Print merged array
    printf("Merged Array:\n");
    for(i = 0; i < n1 + n2; i++) {
        printf("%d ", merged[i]);
    }
    
}