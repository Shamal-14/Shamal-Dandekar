#include <stdio.h>

int main() {
    int choice, num;

    while (1) {
        
        printf("1. Check Even or Odd\n");
        printf("2. Check Prime or Not\n");
        printf("3. Check Palindrome or Not\n");
        printf("4. Check Positive, Negative or Zero\n");
        printf("5. Reverse a Number\n");
        printf("6. Sum of Digits\n");
        printf("7. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

       

        printf("Enter a number: ");
        scanf("%d", &num);

        if (choice == 1) {   // Even or Odd
            if (num % 2 == 0)
                printf("%d is Even\n", num);
            else
                printf("%d is Odd\n", num);
        }
        else if (choice == 2) {   // Prime
            int i, flag = 1;
            if (num <= 1) flag = 0;
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag)
                printf("%d is Prime\n", num);
            else
                printf("%d is Not Prime\n", num);
        }
        else if (choice == 3) {   // Palindrome
            int rev = 0, temp = num;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            if (rev == num)
                printf("%d is Palindrome\n", num);
            else
                printf("%d is Not Palindrome\n", num);
        }
        else if (choice == 4) {   // Positive, Negative or Zero
            if (num > 0)
                printf("%d is Positive\n", num);
            else if (num < 0)
                printf("%d is Negative\n", num);
            else
                printf("Number is Zero\n");
        }
        else if (choice == 5) {   // Reverse number
            int rev = 0, temp = num;
            while (temp != 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            printf("Reverse of %d is %d\n", num, rev);
        }
        else if (choice == 6) {   // Sum of digits
            int sum = 0, temp = num;
            if (temp < 0) temp = -temp;  // handle negative numbers
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            printf("Sum of digits of %d is %d\n", num, sum);
        }
        else {
            printf("Invalid choice! Try again.\n");
        }
    }

    return 0;
}
