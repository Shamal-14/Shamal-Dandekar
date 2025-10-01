#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main() {
    char *dup = strdup("Hello");
    printf("%s\n", dup);
    free(dup);
}