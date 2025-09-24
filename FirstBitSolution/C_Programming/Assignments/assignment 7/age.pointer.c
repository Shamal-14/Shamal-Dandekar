#include <stdio.h>

void checkCategory(int*);  // Function declaration

void main() {
    int age;
    printf("Enter age: ");
    scanf("%d", &age);
    
    checkCategory(&age);
}

void checkCategory(int *age) {
    if (*age < 12)
        printf("Category: Child\n");
    else if (*age <= 19)
        printf("Category: Teenager\n");
    else if (*age <= 59)
        printf("Category: Adult\n");
    else
        printf("Category: Senior\n");
}