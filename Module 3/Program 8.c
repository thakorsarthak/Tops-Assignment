// Swapping without using the third variable....
#include <stdio.h>
int main()
{
	int a = 10, b = 20;
	printf("Before swapping a is %d and b is %d\n", a, b);

	a = a + b; // 10+20=30
	b = a - b; // 30-20=10
	a = a - b; // 30-10=20

	printf("After swapping a is %d and b is %d", a, b);
	return 0;
}
