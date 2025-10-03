#include <stdio.h>

void mystrlower(char str[]) {
    int i = 0;

    while (str[i] != '\0') {
        // if character is uppercase A-Z, convert to lowercase
        if (str[i] >= 'A' && str[i] <= 'Z') {
            str[i] = str[i] + 32;  // ASCII difference
        }
        i++;
    }
}

int main() {
    char s[50];

    printf("Enter a string: ");
    scanf("%s", s);   // simple input

    mystrlower(s);

    printf("Lowercase string: %s\n", s);

    return 0;
}
