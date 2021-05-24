package PROG6112Test2019.q2;

public abstract class Tickets implements iTickets
{
	private final String customerName, movieTitle;
	private final int customerAge;
	private final double moviePrice;

	public Tickets(String customerName, String movieTitle, int customerAge, double moviePrice)
	{
		this.customerName = customerName;
		this.movieTitle = movieTitle;
		this.customerAge = customerAge;
		this.moviePrice = moviePrice;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public String getMovieTitle()
	{
		return movieTitle;
	}

	public int getCustomerAge()
	{
		return customerAge;
	}

	public double getMoviePrice()
	{
		return moviePrice;
	}
}
