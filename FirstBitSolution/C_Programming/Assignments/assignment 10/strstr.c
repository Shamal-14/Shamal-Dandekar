#include<stdio.h>
#include<string.h>
void main()
{
	char *ptr=strstr("Hello world","world");
	printf("%s",ptr);
}