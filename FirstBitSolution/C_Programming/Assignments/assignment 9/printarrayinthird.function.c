#include <stdio.h>
void addArrays(int arr1[], int arr2[], int result[], int );
void printArray(int arr[], int );
void main() {
    int n;

    printf("Enter size of arrays: ");
    scanf("%d", &n);

    int arr1[n], arr2[n], result[n];

    printf("Enter %d elements for first array:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter %d elements for second array:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr2[i]);
    }

    // Function call to add arrays
    addArrays(arr1, arr2, result, n);

    printf("Resultant array after addition:\n");
    printArray(result, n);

    
}
void addArrays(int arr1[], int arr2[], int result[], int n) {
    for (int i = 0; i < n; i++) {
        result[i] = arr1[i] + arr2[i];
    }
}

// Function to print array
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}