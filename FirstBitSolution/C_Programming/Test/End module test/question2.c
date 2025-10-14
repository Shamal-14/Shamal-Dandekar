#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    int i, j;
    int count;

    printf("Enter a string: ");
    scanf(" %[^\n]", str); // read full line including spaces

    printf("\nCharacter Frequencies:\n");

    for (i = 0; str[i] != '\0'; i++) {
        int counted = 0;

        // check if character already counted
        for (j = 0; j < i; j++) {
            if (str[i] == str[j]) {
                counted = 1;
                break;
            }
        }

        if (counted || str[i] == ' ') // skip if counted or space
            continue;

        // count occurrences of str[i]
        count = 0;
        for (j = 0; str[j] != '\0'; j++) {
            if (str[i] == str[j])
                count++;
        }

        printf("%c - %d\n", str[i], count); // correct printing
    }

    
}
