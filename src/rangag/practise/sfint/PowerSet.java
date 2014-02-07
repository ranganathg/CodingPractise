package rangag.practise.sfint;

public class PowerSet
{
	public static void main(String[] args)
	{
		char[] array = { 'a', 'b', 'c' };
		int[] b = new int[array.length];
		powerSet(array, array.length, b, 0);
	}

	private static void powerSet(char[] array, int length, int[] b, int level)
	{
		if (level == length)
		{
			for (int i = 0; i < length; i++)
			{
				if (b[i] == 1)
					System.out.print(array[i]);
			}
			System.out.println();
			return;
		}
		for (int i = 0; i <= 1; i++)
		{
			b[level] = i;
			powerSet(array, length, b, level + 1);
		}
	}
}
