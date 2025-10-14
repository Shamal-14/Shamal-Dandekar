#include <stdio.h>

struct mobile {
    int mid;
    char mname[25];
    float price;
    char brand[20];
};

// input function by value (will NOT update main structure)
struct mobile inputMobile(struct mobile m) {
    printf("Enter Mobile ID: ");
    scanf("%d", &m.mid);

    printf("Enter Mobile Name: ");
    scanf(" %[^\n]", m.mname);

    printf("Enter Price: ");
    scanf("%f", &m.price);

    printf("Enter Brand: ");
    scanf(" %[^\n]", m.brand);

    return m;  // return the updated structure
}

// display function by value
void displayMobile(struct mobile m) {
    printf("\nMobile ID: %d\n", m.mid);
    printf("Mobile Name: %s\n", m.mname);
    printf("Price: %.2f\n", m.price);
    printf("Brand: %s\n", m.brand);
}

int main() {
    struct mobile m1;

    m1 = inputMobile(m1);  // receive updated structure
    displayMobile(m1);

    return 0;
}
