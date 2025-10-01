#include<stdio.h>
#include<string.h>
void main()
{
	char str1[20]="Hello ";
	char str2[]="World";
	strcat(str1,str2);
	
    printf("%s%s",str1);
}