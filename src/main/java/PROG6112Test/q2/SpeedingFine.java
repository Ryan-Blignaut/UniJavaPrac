package PROG6112Test.q2;

public class SpeedingFine extends Fine
{
	public SpeedingFine(String name, int speed)
	{
		super(name, speed);
	}

	@Override
	public void PrintFine()
	{
		System.out.printf("********************\nPERSON: %s\nSPEED: %d km\nFINE PAYABLE: R%d\n********************\n", this.getName(), this.getSpeed(), Math.round(this.getFinePayable()));
	}
}
