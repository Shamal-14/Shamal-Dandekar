#include <stdio.h>
char vowelcons();

int main() {
    vowelcons();

    
}
char vowelcons(){
    char ch;
    ch='a';

   
    
    if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
        ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
        printf("'%c' is a vowel.\n", ch);
    } else {
        printf("'%c' is a consonant.\n", ch);
    }
}
