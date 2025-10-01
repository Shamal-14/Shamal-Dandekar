#include <stdio.h>
#include <string.h>

int main() {
    char str1[] = "Hello";
    char str2[] = "Helium";
    int result = strncmp(str1, str2, 3);  // Compare first 3 chars
    if (result == 0)
        printf("First 3 characters are equal\n");
    else
        printf("They are different\n");
    return 0;
}