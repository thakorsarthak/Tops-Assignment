// Simple interest.....
#include <stdio.h>
int main()
{
	int SI, P, R, T;

	printf("Enter the Principal = ");
	scanf("%d", &P);

	printf("\nEnter the Rate = ");
	scanf("%d", &R);

	printf("\nEnter the Time = ");
	scanf("%d", &T);

	SI = (P * R * T) / 100;
	printf("\nSimple Interest is %d", SI);
	return 0;
}
