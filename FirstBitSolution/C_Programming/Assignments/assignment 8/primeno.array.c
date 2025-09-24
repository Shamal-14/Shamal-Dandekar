#include <stdio.h>

// Function to check prime
int isPrime(int num) {
    if (num <= 1) 
        return 0;   // Not prime
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0)
            return 0; // Not prime
    }
    return 1; // Prime
}

int main() {
    int n, i;

    // Take size of array
    printf("Enter number of elements in array: ");
    scanf("%d", &n);

    int arr[n];

    // Input array
    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    // Print prime numbers
    printf("Prime numbers in the array are: ");
    for(i = 0; i < n; i++) {
        if(isPrime(arr[i])) {
            printf("%d ", arr[i]);
        }
    }

    printf("\n");
    
}