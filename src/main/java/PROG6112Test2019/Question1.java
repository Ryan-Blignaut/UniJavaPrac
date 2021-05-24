package PROG6112Test2019;
/*
Write a Java program to display three monthly sales of different vehicle types. The rows and
columns represent the monthly sales of each vehicle type.
	JAN FEB MAR
SUV 25  15  35
COUPE 25 55 35
SEDAN 11 20 45
VAN 17 27 25
Using a Two-Dimensional array, produce the vehicle type sales report and the total sales made for
each vehicle type. If the total sales made per month are greater than or equal to 100, gold status
is awarded. If the monthly sales are less than 100, silver status is awarded.
 */


public class Question1
{

	public static void main(String[] args)
	{

		StringBuilder stringBuilder = new StringBuilder();
		int[][] monthReports = {
				{25, 15, 35},
				{25, 55, 35},
				{11, 20, 45},
				{17, 27, 25}
		};

		Pair[] carBrands = {
				new Pair("SUV"),
				new Pair("COUPE"),
				new Pair("SEDAN"),
				new Pair("VAN")
		};


		stringBuilder.append("****************************************************************************************************\n");
		stringBuilder.append("VEHICLE STATUS REPORT\n");
		stringBuilder.append("****************************************************************************************************\n");
		stringBuilder.append(String.format("%-20s%-20s%-20s%-20s\n", "", "JAN", "FEB", "MAR"));


		for (int i = 0; i < monthReports.length; i++)
		{
			stringBuilder.append(String.format("%-20s", carBrands[i].getName()));
			for (int j = 0; j < monthReports[i].length; j++)
			{
				carBrands[i].value += monthReports[i][j];
				stringBuilder.append(String.format("%-20s", monthReports[i][j]));
			}
			stringBuilder.append("\n");
		}


		stringBuilder.append("****************************************************************************************************\n");
		stringBuilder.append("VEHICLE TOTAL SALES\n");
		stringBuilder.append("****************************************************************************************************\n");

		for (Pair carBrand : carBrands)
			stringBuilder.append(String.format("%-10s%-10s(%-10s)\n", carBrand.getName(), carBrand.value, carBrand.calculateStar()));
		stringBuilder.append("****************************************************************************************************\n");

		System.out.println(stringBuilder);


	}

}
