#include<stdio.h>
void reverseArray(int arr[], int );
void printArray(int arr[], int );
void main()
{
	
    int n;

    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Original array:\n");
    printArray(arr, n);

    // Function call to reverse
    reverseArray(arr, n);

    printf("Reversed array:\n");
    printArray(arr, n);

  
}
void reverseArray(int arr[], int n) {
    int start = 0, end = n - 1, temp;

    while (start < end) {
        // Swap elements
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}

// Function to print array
void printArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");}