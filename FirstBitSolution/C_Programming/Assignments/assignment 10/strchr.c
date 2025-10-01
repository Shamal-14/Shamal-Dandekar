#include <stdio.h>
#include <string.h>
void main() 
{
    char str[] = "Hello World";
    char *ptr;

    // search for 'o'
    ptr = strchr(str, 'o');

    if (ptr != NULL) {
        printf("First occurrence of 'o' is at position: %ld\n", ptr - str);
        printf("String starting from 'o': %s\n", ptr);
    } else {
        printf("'o' not found in string\n");
    }


}