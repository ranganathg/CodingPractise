/**
 * 4. You are given an array which depicts the stock prices for the following one week, you need to 
 * decide the date on which you want to buy and the date on which you want to see to maximise the profit
 */
package rangag.practise.sfint;

public class MaximumProfitStock
{
	public static void main(String[] args)
	{
		int[] a = { 5, 10, 4, 6, 7 };
		int[] b = { 1, 2, 3, 4, 5 };
		int[] c = { 5, 4, 3, 2, 1 };
		int[] d = { 5, 10, 4, 6, 12 };
		maxProfit(a);
		maxProfit(b);
		maxProfit(c);
		maxProfit(d);
		
		maxProfitV2(a);
		maxProfitV2(b);
		maxProfitV2(c);
		maxProfitV2(d);
	}

	private static void maxProfitV2(int[] a)
	{
		int minTillNow = a[0];
		int profit = 0;
		int maxProfit = 0;
		for (int i = 0; i < a.length; i++)
		{
			profit = a[i] - minTillNow;
			if (maxProfit < profit)
			{
				maxProfit = profit;
			}
			if (a[i] < minTillNow)
				minTillNow = a[i];
		}
		System.out.println(maxProfit);
	}

	private static void maxProfit(int[] d)
	{
		int buyDay = 0;
		int sellDay = 0;
		int maxProfit = 0;
		int maxBuyay = 0;
		int maxSellDay = 0;
		for (int i = 1; i < d.length; i++)
		{
			if (d[i] > d[sellDay])
			{
				sellDay = i;
				if (maxProfit < d[sellDay] - d[buyDay])
				{
					maxProfit = d[sellDay] - d[buyDay];
					maxBuyay = buyDay;
					maxSellDay = sellDay;
				}
			}
			if (d[i] < d[buyDay])
			{
				buyDay = sellDay = i;
			}
		}
		System.out.println("maxProfit " + maxProfit + " at :" + maxBuyay + " "
				+ maxSellDay);
	}
}
