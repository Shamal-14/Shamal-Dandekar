#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Apple,Orange,Banana,Grapes";
    char *token = strtok(str, ",");
    while (token != NULL) {
        printf("%s\n", token);
        token = strtok(NULL, ",");
    }
    return 0;
}