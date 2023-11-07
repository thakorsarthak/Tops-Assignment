// Area of triangle,rectangle and circle.....
#include <stdio.h>
int main()
{
	printf(".....For finding Area of Triangle.....\n");
	float side, base, Area;

	printf("Enter the value of side : ");
	scanf("%f", &side);

	printf("Enter the value of base : ");
	scanf("%f", &base);

	Area = 0.5 * side * base;
	printf("Areanof triangle is %0.2f\n", Area);

	printf("\n\n.....For Area of Rectangle.....\n");

	float length, breadth;

	printf("Enter the value of Length : ");
	scanf("%f", &length);

	printf("Enter the value of breadth : ");
	scanf("%f", &breadth); 

	Area = length * breadth;
	printf("Area of Rectangle is %0.2f\n", Area);

	printf("\n\n.....For Area of Circle.....\n");

	float radius, pie;

	printf("Enter the value of radius : ");
	scanf("%f", &radius);

	pie = 3.14;
	Area = pie * radius * radius;

	printf("Area of Circle is %0.2f", Area);

	return 0;
	return 0;
}
