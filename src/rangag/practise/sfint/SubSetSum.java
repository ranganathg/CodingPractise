/**
 * 3. Given an array of integers and a value 'k', 
 * you need to check if there is any subset of the array which sums to 'k'
 */
package rangag.practise.sfint;

public class SubSetSum
{
	public static void main(String[] args)
	{
		subSetSum(new int[] { 5, 2, 3, 1, 4, 8, 6 },20 );
	}

	public static void subSetSum(int[] is, int sum)
	{
		if (is == null)
		{
			return;
		}
		int n = is.length;
		boolean[][] subSet = new boolean[sum + 1][n + 1];
		for (int i = 0; i <= n; i++)
		{
			subSet[0][i] = true;
		}
		for (int i = 1; i <= sum; i++)
		{
			subSet[i][0] = false;
		}

		for (int i = 1; i <= sum; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				subSet[i][j] = subSet[i][j - 1];
				if (is[j - 1] <= i)
				{
					subSet[i][j] = subSet[i][j - 1]
							|| subSet[i - is[j - 1]][j - 1];
				}
			}
		}
		System.out.println(subSet[sum][n]);
	}
}
