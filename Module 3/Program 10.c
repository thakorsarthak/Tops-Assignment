//monday to sunday and consonants & vowel....using SWITCH CASE....
#include <stdio.h>
int main()
{
	char A, B, C;
	printf("\t\t\tSWITCH CASE PROGRAM\n");
	printf("\t\tEnter the * to show monday to sunday \n\t\tEnter the + to show vowel and consonants \n");
	scanf("\n%c", &A);

	switch (A)
	{
	case '*':

		printf("1\t2\t3\t4\t5\t6\t7\n");
		printf("Entered value : ");
		scanf("\n%c", &B);

	switch (B)
			{
		// if your taked operation is in character(like here it is B) then use ' if it is char
		// And if your variable is in int and float then ' is not needed
				case '1':
					printf("The day is Monday");
					break;

				case '2':
						printf("Tuesday");
						break;

				case '3':
						printf("Wednesday");
						break;

				case '4':
						printf("Thursday");
						break;

				case '5':
						printf("Friday");
						break;

				case '6':
						printf("Saturday");
						break;

				case '7':
						printf("Sunday");
						break;

				default:
						printf("Pls Enter number from 1 to 7 only\n");
						break;
			}

	case '+':
		printf("\nEnter the alphabate and check wheather it is Vowel and consonant\n ");
		scanf("\n%c", &C);
			
	
		if((C>='A' && C<='Z') || (C>='a' && C<='z'))
			{
				
				switch (C)
					{
						case 'A':
						case 'E':
						case 'I':
						case 'O':
						case 'U':
						case 'a':
						case 'e':
						case 'i':
						case 'o':
						case 'u':
							printf("It is Vowel");
							break;
							
						default:
							printf("It is consonant");
							break;
					}
				}
				else 
						{
							printf("Pls enter the alphabate");
						}
			break;
			
	default:
		printf("\nPls enter the valid character from above");
	}

	return 0;
}
