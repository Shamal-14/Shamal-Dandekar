#include <stdio.h>

void checkVowelConsonant(char*);
int main()
{
    char ch;
    printf("Enter a character: ");
    scanf(" %c", &ch);
    checkVowelConsonant(&ch);
    return 0;
}
void checkVowelConsonant(char* ch)
{
    // Convert to lowercase if uppercase
    if (*ch >= 'A' && *ch <= 'Z')
        *ch += 32;

    if (*ch == 'a' || *ch == 'e' || *ch == 'i' || *ch == 'o' || *ch == 'u')
        printf("'%c' is a Vowel.\n", *ch);
    else if ((*ch >= 'a' && *ch <= 'z'))
        printf("'%c' is a Consonant.\n", *ch);
    else
        printf("'%c' is not an alphabet.\n", *ch);
}
