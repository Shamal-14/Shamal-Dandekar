#include <stdio.h>
void mystrcpy(char dest[], char src[]);
int main() {
    char str1[100];              // destination
    char str2[] = "Hello World"; // source

    mystrcpy(str1, str2);  // call user-defined function

    printf("Copied String: %s\n", str1);

    return 0;
}

// user-defined strcpy function
void mystrcpy(char dest[], char src[]) {
    int i = 0;
    while (src[i] != '\0') {
        dest[i] = src[i];   // copy each character
        i++;
    }
    dest[i] = '\0';  // add null character at the end
}