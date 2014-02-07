package rangag.practise.sfint;

public class CombinationOfNumbersSumN
{
	public static void main(String[] args)
	{
		int[] array = new int[5];
		sumCombination(array, 5, 0);
	}

	private static void sumCombination(int[] array, int number, int k)
	{
		if (number == 0)
		{
			for (int i = 0; i < k; i++)
			{
				System.out.print(array[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 1; i <= number; i++)
		{
			array[k] = i;
			sumCombination(array, number - i, k + 1);
		}
	}
}
