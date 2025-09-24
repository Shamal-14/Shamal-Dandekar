#include <stdio.h>

void calculateTotalSalary(float*);
int main()
{
    float basic;
    printf("Enter basic salary: ");
    scanf("%f", &basic);
    calculateTotalSalary(&basic);
    return 0;
}
void calculateTotalSalary(float* basic)
{
    float da, ta, hra, total;

    if (*basic <= 5000)
    {
        da = *basic * 0.10;
        ta = *basic * 0.20;
        hra = *basic * 0.25;
    }
    else
    {
        da = *basic * 0.15;
        ta = *basic * 0.25;
        hra = *basic * 0.30;
    }

    total = *basic + da + ta + hra;

    printf("Basic Salary: %.2f\n", *basic);
    printf("DA: %.2f\n", da);
    printf("TA: %.2f\n", ta);
    printf("HRA: %.2f\n", hra);
    printf("Total Salary: %.2f\n", total);
}
