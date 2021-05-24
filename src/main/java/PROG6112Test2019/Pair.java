package PROG6112Test2019;

public class Pair
{
	private final String name;
	protected int value;

	public Pair(String name)
	{
		this.name = name;
		this.value = 0;
	}

	public String getName()
	{
		return name;
	}

	public String calculateStar()
	{
		if (this.value >= 100)
			return "Gold star";
		else
			return "Sliver star";

	}

}
