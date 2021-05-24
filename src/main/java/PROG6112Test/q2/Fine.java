package PROG6112Test.q2;

public abstract class Fine implements iFine
{
	private String name;
	private int speed;
	private double finePayable;

	public Fine(String name, int speed)
	{
		this.name = name;
		this.speed = speed;
	}


	public Fine calculateFine()
	{
		if (this.speed >= 120)
			finePayable = this.speed * 10.20;
		else
			finePayable = 0;
		return this;

	}


	public String getName()
	{
		return name;
	}

	public int getSpeed()
	{
		return speed;
	}

	public double getFinePayable()
	{
		return finePayable;
	}
}
