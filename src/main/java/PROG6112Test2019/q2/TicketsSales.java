package PROG6112Test2019.q2;

public class TicketsSales extends Tickets
{
	public TicketsSales(String customerName, String movieTitle, int customerAge, double moviePrice)
	{
		super(customerName, movieTitle, customerAge, moviePrice);
	}

	@Override
	public void print_Tickets()
	{
		final double discount = getCustomerAge() >= 65 ? 0.10 : 0;
		final double discountTotal = getMoviePrice() * discount;
		final double total = getMoviePrice() + discountTotal;

		System.out.printf("CUSTOMER: %s\nMOVIE: %s\nCOST: R%.2f\nDISCOUNT:R%.2f\nTOTAL:R%.2f\n", getCustomerName(), getMovieTitle(), getMoviePrice(), discountTotal, total);
	}
}
