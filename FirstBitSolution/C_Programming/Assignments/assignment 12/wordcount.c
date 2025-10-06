#include <stdio.h>

int main() {
    char str[100];
    int i, wCount = 0;

    printf("Enter a string: ");
    scanf("%[^\n]", str);   

    for (i = 0; str[i] != '\0'; i++) {
        
        if (str[i] == ' ' && str[i + 1] != ' ' && str[i + 1] != '\0') {
            wCount++;
        }
    }

   
    if (str[0] != '\0')
        wCount++;

    printf("Number of words: %d", wCount);
    return 0;
}
