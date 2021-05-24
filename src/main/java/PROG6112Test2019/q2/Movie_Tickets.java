package PROG6112Test2019.q2;

import java.util.Scanner;

public class Movie_Tickets
{
	public static void main(String[] args)
	{
		final Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the customers name: ");
		final String name = scanner.nextLine();
		System.out.println("Enter the movies name: ");
		final String moviesName = scanner.nextLine();
		System.out.println("Enter the customers age: ");
		final int age = scanner.nextInt();
		System.out.println("Enter the movie cost: ");
		final double cost = scanner.nextDouble();
		new TicketsSales(name, moviesName, age, cost).print_Tickets();


	}

}
