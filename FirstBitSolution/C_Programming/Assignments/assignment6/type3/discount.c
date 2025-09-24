#include <stdio.h>

void calculateDiscount(float price, char student);

void main() {
    float price;
    char student;

    printf("Enter price: ");
    scanf("%f", &price);
    printf("Are you a student? (y/n): ");
    scanf(" %c", &student);

    calculateDiscount(price, student);
}

void calculateDiscount(float price, char student) {
    float discount;

    if (student == 'y' || student == 'Y') {
        if (price > 500)
            discount = price * 0.20;
        else
            discount = price * 0.10;
    } else {
        if (price > 600)
            discount = price * 0.15;
        else
            discount = 0.0;
    }

    printf("Discount = %.2f\n", discount);
}