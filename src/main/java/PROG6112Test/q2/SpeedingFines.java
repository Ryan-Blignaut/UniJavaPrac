package PROG6112Test.q2;

import java.util.Scanner;

public class SpeedingFines
{
	public static void main(String[] args)
	{
		final Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the persons name: ");
		final String name = scanner.nextLine();
		System.out.println("Enter the speed: ");
		final int speed = scanner.nextInt();

		final SpeedingFine speedingFine = new SpeedingFine(name, speed);
		speedingFine.calculateFine().PrintFine();


	}

}
