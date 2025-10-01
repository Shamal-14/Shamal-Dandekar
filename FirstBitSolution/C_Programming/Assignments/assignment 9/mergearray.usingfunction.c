#include <stdio.h>
void mergeArrays(int arr1[], int , int arr2[], int , int result[]);
void printArray(int arr[], int );
void main() 
{
    int n1, n2;

    printf("Enter size of first array: ");
    scanf("%d", &n1);

    int arr1[n1];
    printf("Enter %d elements of first array:\n", n1);
    for (int i = 0; i < n1; i++) {
        scanf("%d", &arr1[i]);
    }

    printf("Enter size of second array: ");
    scanf("%d", &n2);

    int arr2[n2];
    printf("Enter %d elements of second array:\n", n2);
    for (int i = 0; i < n2; i++) {
        scanf("%d", &arr2[i]);
    }

    int result[n1 + n2]; // merged array size

    // Function call to merge arrays
    mergeArrays(arr1, n1, arr2, n2, result);

    printf("Merged array:\n");
    printArray(result, n1 + n2);

    
}
void mergeArrays(int arr1[], int n1, int arr2[], int n2, int result[]) {
    int i, j;

    // Copy first array
    for (i = 0; i < n1; i++) {
        result[i] = arr1[i];
    }

    // Copy second array
    for (j = 0; j < n2; j++) {
        result[i + j] = arr2[j];
    }
}

// Function to print array
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");
}