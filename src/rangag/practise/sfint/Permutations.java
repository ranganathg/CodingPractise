package rangag.practise.sfint;

public class Permutations
{
	public static void main(String[] args)
	{
		int[] input = { 1, 2, 3, 4 };
		permutationsVersion1(input, 0, input.length);
		int[] output = new int[input.length];
		boolean[] used = new boolean[input.length];
		permutationsVersion2(input, output, used, 0, input.length);

	}

	private static void permutationsVersion2(int[] input, int[] output,
			boolean[] used, int recurseLevel, int length)
	{
		if (recurseLevel == length)
		{
			for (int i = 0; i < length; i++)
			{
				System.out.print(output[i] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < input.length; i++)
		{
			if (used[i])
			{
				continue;
			}
			output[recurseLevel] = input[i];
			used[i] = true;
			permutationsVersion2(input, output, used, recurseLevel + 1, length);
			used[i] = false;
		}
	}

	private static void permutationsVersion1(int[] a, int start, int length)
	{
		for (int k = 0; k < length; k++)
			System.out.print(a[k] + " ");
		System.out.println();
		int i, j;
		for (i = start; i < length - 1; i++)
		{
			for (j = i + 1; j < length; j++)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				permutationsVersion1(a, i + 1, length);
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
	}
}
