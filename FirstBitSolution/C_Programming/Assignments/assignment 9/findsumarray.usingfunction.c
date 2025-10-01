#include <stdio.h>
int findSum(int arr[], int ); 
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

    int total = findSum(arr, n);

    printf("Sum of all elements = %d\n", total);

    
}
int findSum(int arr[], int n) 
{
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];   
    }
    return sum;  
}