// dynamic calculator.....
#include <stdio.h>
int main()
{
	char operation;
	int A, B;
	printf("   \t======Dynamic Calculator\n\n");
	printf("\t||||||Operation|||||||\n\n");
	printf("\tPress + for addition\n \tPress - for subtraction\n \tPress * for multiple\n \tPress / for Division\n \tPress %% for Modulo\n");
	printf("\t--------------------\n");
	printf(" \tEnter your Operation from above\n");
	scanf("\t%c", &operation);

	switch (operation)
	{
	case '+':
		printf("Your selected operation is Addition");
		printf("\n Enter A and B\n");
		scanf("%d %d", &A, &B);
		printf("Addition of %d and %d is %d", A, B, A + B);
		break;

	case '-':
		printf("Your selected operation is Subtraction");
		printf("\n Enter A and B\n");
		scanf("%d %d", &A, &B);
		printf("Subtraction of %d and %d is %d", A, B, A - B);
		break;

	case '*':
		printf("Your selected operation is Multiplication");
		printf("\n Enter A and B\n");
		scanf("%d %d", &A, &B);
		// printf("Multiplication of %d and %d is %d",A,B,A*B);
		if (A == 0 || B == 0)
		{
			printf("Enter the Proper value instead of 0"); //
		}

		else
		{
			printf("Multiplication of %d and %d is %d", A, B, A * B);
		}
		break;

	case '/':
		printf("Your selected operation is Division");
		printf("\n Enter A and B\n");
		scanf("%d %d", &A, &B);
		if (B == 0)
		{
			printf("Enter the Proper value instead of 0"); // for if someone enter 0 for dinominator
		}

		else
		{
			printf("Division of %d and %d is %d", A, B, A / B);
		}

		break;

	case '%':
		printf("Your selected operation is Modulo");
		printf("\nEnter A and B\n");
		scanf("%d %d", &A, &B);
		if (A == 0 || B == 0)
		{
			printf("Enter the proper value instead of 0");
		}
		break;

	default:
		printf("Enter the Operations from above");
	}
	return 0;
}
