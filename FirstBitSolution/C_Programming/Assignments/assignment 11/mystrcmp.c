#include <stdio.h>

int mystrcmp(const char str1[], const char str2[]) {
    int i = 0;

    while (str1[i] == str2[i] && str1[i] != '\0') {
        i++;
    }

    if (str1[i] == str2[i])
        return 0;   // equal
    else
        return 1;   // not equal
}

int main() {
    char s1[50], s2[50];

    printf("Enter first string: ");
    scanf("%s", s1);   
    printf("Enter second string: ");
    scanf("%s", s2);

    if (mystrcmp(s1, s2) == 0)
        printf("Strings are equal.\n");
    else
        printf("Strings are not equal.\n");

    return 0;
}
