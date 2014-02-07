/**
 * Given an array, you need to decide if the array can be divided into 
 * two subarrays where the sum of two subarrays is same
 */
package rangag.practise.sfint;

public class EqualSumSubArrays
{
	public static void main(String[] args)
	{
		equalSumSubArray(new int[] { 4, 4, 4, 4 });
	}

	private static void equalSumSubArray(int[] is)
	{
		int sum = 0;
		for (int i = 0; i < is.length; i++)
		{
			sum += is[i];
		}
		if (sum % 2 != 0)
		{
			System.out.println("cant be divided with equal sum " + sum);
			return;
		}
		sum = sum / 2;
		SubSetSum.subSetSum(is, sum);
	}
}
