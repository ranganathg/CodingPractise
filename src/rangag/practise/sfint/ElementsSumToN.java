package rangag.practise.sfint;

public class ElementsSumToN
{
	public static void main(String[] args)
	{
		int[] a = { 5, 2, 3, 1, 4, 8, 6 };
		int[] output = new int[a.length];
		elementsSumToN(a, 9, output, 0, 0);
	}

	private static void elementsSumToN(int[] a, int sum, int[] output,
			int index, int k)
	{
		if (sum < 0)
			return;
		if (sum == 0)
		{
			for (int i = 0; i < k; i++)
			{
				System.out.print(output[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = index; i < a.length; i++)
		{
			int subSum = sum - a[i];
			output[k] = a[i];
			elementsSumToN(a, subSum, output, i + 1, k + 1);
		}
	}
}
