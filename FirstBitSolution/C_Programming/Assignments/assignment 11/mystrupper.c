#include <stdio.h>

void mystrupper(char str[]) {
    int i = 0;

    while (str[i] != '\0') {
        // if character is lowercase a-z, convert to uppercase
        if (str[i] >= 'a' && str[i] <= 'z') {
            str[i] = str[i] - 32;  // ASCII difference
        }
        i++;
    }
}

int main() {
    char s[50];

    printf("Enter a string: ");
    scanf("%s", s);   // simple input

    mystrupper(s);

    printf("Uppercase string: %s\n", s);

    return 0;
}
