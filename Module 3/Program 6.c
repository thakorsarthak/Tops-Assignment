// convert days into year and year into days.....
#include <stdio.h>
int main()
{
	int A;

	printf("Select the Operation \n 1 : Convert days into year \n 2 : Convert year into days ");
	printf("\nEnter the Operation\n");
	scanf("%d", &A);
	float B;
	int C;

	switch (A)
	{
	case 1:
	{
		printf("Enter the days : ");
		scanf("%f", &B);
		printf("Year is %f", B / 365);
	}

	case 2:
	{
		printf("Enter the year : ");
		scanf("%d", &C);

		printf("%d", C * 365);
	}
	}

	return 0;
}
