#include <stdio.h>

void mystrncpy(char dest[], const char src[], int n) {
    int i = 0;

    
    while (i < n && src[i] != '\0') {
        dest[i] = src[i];
        i++;
    }

    
    dest[i] = '\0';
}

int main() {
    char source[50], dest[50];
    int n;

    printf("Enter source string: ");
    scanf("%s", source);

    printf("Enter number of characters to copy: ");
    scanf("%d", &n);

    mystrncpy(dest, source, n);

    printf("Copied string: %s\n", dest);

    return 0;
}
