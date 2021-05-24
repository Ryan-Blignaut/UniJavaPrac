package PROG6112Test.q2;

/*
 * Write a Java program to display the three highest monthly speeding fines recorded for four
 * different cities. The following rows and columns represent the monthly speeding fines of each
 * city
 *
 *       JAN    FEB     MAR
 *	JHB  128km  135km   139km
 *	DBN  155km  129km   175km
 *	CTN  129km  130km   185km
 *	PE   195km   155km    221km
 *
 * */
public class Question2
{
	public static void main(String[] args)
	{


		int[][] speedingFinesSpeeds = {
				{128, 135, 139},
				{155, 129, 175},
				{129, 130, 185},
				{195, 155, 221}
		};


		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("****************************************************************************************************\n");
		stringBuilder.append("SPEEDING FINES REPORT\n");
		stringBuilder.append("****************************************************************************************************\n");
		stringBuilder.append(String.format("%-20s%-20s%-20s%-20s\n", "", "JAN", "FEB", "MAR"));


		int highest = speedingFinesSpeeds[0][0];
		int lowest = speedingFinesSpeeds[0][0];
		for (int i = 0; i < speedingFinesSpeeds.length; i++)
		{
			String place;
			switch (i)
			{
				case 0:
					place = "JHB";
					break;
				case 1:
					place = "DBN";
					break;
				case 2:
					place = "CTN";
					break;
				case 3:
					place = "PE";
					break;
				default:
					throw new IllegalStateException("Unexpected value: " + i);
			}

			stringBuilder.append(String.format("%-20s", place));
			for (int j = 0; j < speedingFinesSpeeds[i].length; j++)
			{
				final int speed = speedingFinesSpeeds[i][j];
				if (speed > highest)
					highest = speed;
				if (speed < lowest)
					lowest = speed;

				stringBuilder.append(String.format("%-20s", speed + "km"));
			}
			stringBuilder.append("\n");
		}
		stringBuilder.append("****************************************************************************************************\n");
		stringBuilder.append("SPEEDING FINE STATISTICS\n");
		stringBuilder.append("****************************************************************************************************\n");
		stringBuilder.append(String.format("Maximum speed captured: %skm\n", highest));
		stringBuilder.append(String.format("Maximum speed captured: %skm\n", lowest));
		stringBuilder.append("****************************************************************************************************\n");

		System.out.println(stringBuilder);


	}


}
