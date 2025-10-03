#include <stdio.h>

void mystrcat(char str1[], const char str2[]) {
    int i = 0, j = 0;

    // move i to the end of str1
    while (str1[i] != '\0') {
        i++;
    }

    // copy str2 to the end of str1
    while (str2[j] != '\0') {
        str1[i] = str2[j];
        i++;
        j++;
    }

    // add null terminator at the end
    str1[i] = '\0';
}

int main() {
    char s1[100], s2[50];

    printf("Enter first string: ");
    scanf("%s", s1);
    printf("Enter second string: ");
    scanf("%s", s2);

    mystrcat(s1, s2);

    printf("After concatenation: %s\n", s1);

    return 0;
}
