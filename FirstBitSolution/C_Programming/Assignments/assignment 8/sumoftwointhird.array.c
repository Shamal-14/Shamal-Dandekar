#include <stdio.h>

int main() {
    int n, i;

    // Take size of arrays
    printf("Enter number of elements in arrays: ");
    scanf("%d", &n);

    int arr1[n], arr2[n], sum[n];

    // Input first array
    printf("Enter %d elements of first array:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr1[i]);
    }

    // Input second array
    printf("Enter %d elements of second array:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr2[i]);
    }

    // Add arrays
    for(i = 0; i < n; i++) {
        sum[i] = arr1[i] + arr2[i];
    }

    // Print result array
    printf("Resultant Sum Array:\n");
    for(i = 0; i < n; i++) {
        printf("%d ", sum[i]);
    }
    
}