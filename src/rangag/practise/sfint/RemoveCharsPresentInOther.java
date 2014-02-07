package rangag.practise.sfint;

public class RemoveCharsPresentInOther
{
	public static void main(String[] args)
	{
		char[] rem = new char[] { 'a', 'b' };
		removeChars(new char[] { 'b', 'd', 'a', 'a', 'e', 'f', 'b', 'g' }, rem);
	}

	private static void removeChars(char[] cs, char[] rem)
	{
		boolean[] tracker = new boolean[256];
		for (char c : rem)
		{
			tracker[c] = true;
		}
		int k = 0;
		for (int i = 0; i < cs.length; i++)
		{
			if (!tracker[cs[i]])
			{
				cs[k++] = cs[i];
			}
		}
		for (int i = 0; i < k; i++)
		{
			System.out.print(cs[i]+" ");
		}
		System.out.println();
	}
}
