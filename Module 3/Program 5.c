// Check wheather it is leap year or not....
int main()
{
	int A;
	float B, C;

	printf("Enter the Year and check it is leap year or not : ");
	scanf("%d", &A);

	if (A % 4 == 0)
	{
		printf("It is leap year.");
	}
	else
	{
		printf("\nIt is not leap year.");
	}

	return 0;
}
