#include <stdio.h>

int main() {
    int n, i, key, found = 0;

    // Take size of array
    printf("Enter number of elements in array: ");
    scanf("%d", &n);

    int arr[n];

    // Take input for array elements
    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Take the number to search
    printf("Enter the number to search: ");
    scanf("%d", &key);

    // Linear search
    for(i = 0; i < n; i++) {
        if(arr[i] == key) {
            printf("Number %d found at position %d (index %d)\n", key, i+1, i);
            found = 1;
            break;
        }
    }

    if(!found) {
        printf("Number %d not found in the array.\n", key);
    }

    return 0;
}