// Take 10 number from the user.....check even and odd....And Add even and odd numbers..
#include <stdio.h>
int main()
{
	int A, i;
	int sumeven = 0;
	int sumodd = 0;

	for (i = 1; i <= 10; i++)
	{
		printf("Enter the value : ");
		scanf("\n%d", &A);

		if (A % 2 == 0)
		{
			printf("\tIt is Even Number\n");
			sumeven += A;
		}

		else if (A % 2 == 1)
		{
			printf("\tIt is Odd number\n");
			sumodd += A;
		}
	}
	printf("\nAddition Of Even number is %d", sumeven);
	printf("\nAddition Of Odd number is %d", sumodd);

	return 0;
}
