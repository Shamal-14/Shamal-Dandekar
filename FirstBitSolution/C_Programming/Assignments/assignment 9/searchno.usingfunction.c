#include<stdio.h>
int searchElement(int arr[], int , int );
void main() 
{
    int n, key;

    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];

    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter number to search: ");
    scanf("%d", &key);

    int pos = searchElement(arr, n, key);

    if (pos != -1) {
        printf("Number %d found at position %d (index %d)\n", key, pos + 1, pos);
    } else {
        printf("Number %d not found in array.\n", key);
    }

  
}
int searchElement(int arr[], int n, int key)
 {
    for (int i = 0; i < n; i++) {
        if (arr[i] == key) {
            return i;  // return index if found
        }
    }
    return -1;  // return -1 if not found
}