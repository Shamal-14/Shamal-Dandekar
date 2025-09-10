#include<stdio.h>

void areaCircle(int r);

void main() {
    int radius = 10;           // declaration first
    areaCircle(radius);        // function call with parameter
}

// function definition at the bottom
void areaCircle(int r) {
    float area = 3.14 * r * r; // calculate area
    printf("Area: %f\n", area);
}
