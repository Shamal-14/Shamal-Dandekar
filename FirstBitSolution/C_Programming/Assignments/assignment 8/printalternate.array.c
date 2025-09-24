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

    // Print alternate elements
    printf("Alternate elements in array are:\n");
    for(i = 0; i < n; i += 2) {  // step = 2
        printf("%d ", arr[i]);
    }

    printf("\n");
    
}