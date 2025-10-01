#include <stdio.h>
#include <string.h>
int main() {
    char *p = strpbrk("Hello123","012345");
    printf("%s\n", p);
}