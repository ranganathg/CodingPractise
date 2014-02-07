package rangag.practise.sfint;

import java.awt.List;
import java.util.ArrayList;

public class MaximumProfitStocksMultipleSell
{
	public static void main(String[] args)
	{
		maxProfitMultipleSell(new int[] {1000, 100, 180, 260, 310, 40, 535, 695 });
	}

	private static void maxProfitMultipleSell(int[] a)
	{
		ArrayList<Interval> ints = new ArrayList<Interval>();
		int i = 0;
		int n = a.length;
		int count = 0;
		while (i < n - 1)
		{
			while ((i < n - 1) && a[i + 1] <= a[i])
			{
				i++;
			}
			if (i == n - 1)
				break;
			int buyday = i++;
			while ((i < n) && a[i] >= a[i - 1])
			{
				i++;
			}
			int sellday = i - 1;
			ints.add(new Interval(buyday, sellday));
		}
		for (Interval interval : ints)
		{
			System.out.println(interval.buyDay + " " + interval.sellDay);
		}
	}
}

class Interval
{
	int buyDay;
	int sellDay;

	public Interval(int bd, int sd)
	{
		buyDay = bd;
		sellDay = sd;
	}
}
