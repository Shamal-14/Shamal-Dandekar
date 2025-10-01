#include <stdio.h>
void printPrimes(int arr[], int );
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

    printPrimes(arr, n);  // function call

    
}
void printPrimes(int arr[], int n) {
    printf("Prime numbers in array: ");
    int found = 0;

    for (int i = 0; i < n; i++) {
        int num = arr[i];
        int isPrime = 1;   // assume number is prime

        if (num <= 1) {
            isPrime = 0;   // 1 or negative ? not prime
        } else {
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    isPrime = 0;  // divisible ? not prime
                    break;
                }
            }
        }

        if (isPrime) {
            printf("%d ", num);
            found = 1;
        }
    }

    if (!found) {
        printf("No prime numbers found.");
    }
    printf("\n");
}