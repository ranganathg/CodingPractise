/**
 * https://code.google.com/codejam/contest/351101/dashboard#s=p0
 */
package rangag.practise.google.codejam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class StoreCredit
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("E:\\CodeJam\\A-large-practice.in"));
		int testCases = in.nextInt();
		HashMap<Integer, Integer> itemMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < testCases; i++)
		{
			itemMap = new HashMap<Integer, Integer>();
			int credit = in.nextInt();
			int items = in.nextInt();
			for (int j = 0; j < items; j++)
			{
				int cost = in.nextInt();
				if (itemMap.containsKey(credit - cost))
				{
					System.out.format("Case #%d: %d %d\n", i + 1,
							itemMap.get(credit - cost) + 1, j + 1);
				}
				itemMap.put(cost, j);
			}
		}
		in.close();
	}
}
