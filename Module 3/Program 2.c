// simple calculator
#include <stdio.h>
int main()

{
	int A, B;

	printf("Enter the Value of A : ");
	scanf("%d", &A);

	printf("Enter the Value of B : ");
	scanf("%d", &B);

	int C = A % B;
	printf("Addition of %d and %d is %d ", A, B, A + B);
	printf("\nSubtraction of %d  and %d  is %d", A, B, A - B);
	printf("\nMultipication of %d  and %d  is %d", A, B, A * B);
	printf("\nDivision of %d  and %d  is %d ", A, B, A / B);
	printf("\nModulo of %d  and %d  is %d", A, B, C);
	return 0;
}
