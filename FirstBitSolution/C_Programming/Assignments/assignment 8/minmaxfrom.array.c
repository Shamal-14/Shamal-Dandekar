#include <stdio.h>

int main() {
    int n, i;

    // Take size of array
    printf("Enter number of elements in array: ");
    scanf("%d", &n);

    int arr[n];

    // Take input for array elements
    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Initialize min and max with first element
    int min = arr[0];
    int max = arr[0];

    // Traverse the array to find min and max
    for(i = 1; i < n; i++) {
        if(arr[i] < min) {
            min = arr[i];
        }
        if(arr[i] > max) {
            max = arr[i];
        }
    }

    // Print results
    printf("Minimum element = %d\n", min);
    printf("Maximum element = %d\n", max);

    return 0;
}