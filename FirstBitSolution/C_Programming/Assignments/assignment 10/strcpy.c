#include<stdio.h>
#include<string.h>
void main()
{
	char src[]="World";
	char dest[10];
	strcpy(dest,src);
	printf("Source string: %s\n", src);
    printf("Destination string: %s\n", dest);
}