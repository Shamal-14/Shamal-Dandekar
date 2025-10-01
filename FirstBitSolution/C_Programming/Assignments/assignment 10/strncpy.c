#include<stdio.h>
#include<string.h>
void main()
{
	char src[]="Shamal";
	char dest[10];
	strncpy(dest,src,4);
	dest[4]='\0';
	printf("Source string: %s\n", src);
    printf("Destination string: %s\n", dest);
}