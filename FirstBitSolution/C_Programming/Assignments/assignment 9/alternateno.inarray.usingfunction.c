#include <stdio.h>
void printAlternate(int arr[],int  );
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

    printAlternate(arr, n);  // function call

}
void printAlternate(int arr[],int n)
{
	printf("Alternate elements in array: ");
    for (int i = 0; i < n; i += 2) 
	{   // increase i by 2 each time
        printf("%d ", arr[i]);
    }
    printf("\n");

}