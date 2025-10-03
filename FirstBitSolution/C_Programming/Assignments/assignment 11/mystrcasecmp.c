#include <stdio.h>

void mystrcascemp(char str[]) {
    int i = 0;

    // convert first character to uppercase if it's a letter
    if (str[i] >= 'a' && str[i] <= 'z') {
        str[i] = str[i] - 32;
    }

    // convert remaining letters to lowercase
    i++;
    while (str[i] != '\0') {
        if (str[i] >= 'A' && str[i] <= 'Z') {
            str[i] = str[i] + 32;
        }
        i++;
    }
}

int main() {
    char s[50];

    printf("Enter a string: ");
    scanf("%s", s);

    mystrcascemp(s);

    printf("After mystrcascemp: %s\n", s);

    return 0;
}
