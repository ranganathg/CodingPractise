/**
 * My Trilogy Question
 * 2. Given a binary tree in the form of array 
 * where the value is the parent of the index, you need to find the height of the binary tree
 */
package rangag.practise.sfint;

public class HeightOfTreeFromArray
{
	public static void main(String[] args)
	{
		int[] tree = { 3, 6, 1, 1, 2, 2, -1, 3, 0, 8, 6 };
		findHeightOfTreeFromArray(tree);
	}

	private static void findHeightOfTreeFromArray(int[] tree)
	{
		int[] heights = new int[tree.length];
		for (int i = 0; i < heights.length; i++)
		{
			heights[i] = -1;
		}
		int height = 0;
		for (int i = 0; i < tree.length; i++)
		{
			if (tree[i] == -1)
			{
				heights[i] = 0;
				continue;
			}
			if (heights[tree[i]] != -1)
			{
				heights[i] = heights[tree[i]] + 1;
			} else
			{
				int temp = tree[i];
				int count = 0;
				while (temp != -1)
				{
					count++;
					temp = tree[temp];
				}
				heights[i] = count;
			}
		}
		for (int i : heights)
		{
			if (height < i)
				height = i;
		}
		System.out.println(height);
	}
}
