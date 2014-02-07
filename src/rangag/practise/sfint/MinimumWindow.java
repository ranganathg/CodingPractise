/**
 * Given two arrays, you need to find the minimum window in first array which contains 
 * all the elements of second array. 
 * If the second array contains 2 3's , your minimum window should also contain 2 3's
 */
package rangag.practise.sfint;

import java.util.HashMap;

public class MinimumWindow
{
	public static void main(String[] args)
	{
		minimumWindow(new int[] { 1, 2, 2, 1, 3, 2, 1, 1 },
				new int[] { 1, 1, 2 });
	}

	
	private static void minimumWindow(int[] mainArray, int[] intsToCheck)
	{
		HashMap<Integer, Integer> shouldFindChars = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hasFoundChars = new HashMap<Integer, Integer>();
		for (int i : intsToCheck)
		{
			Integer val = shouldFindChars.get(i);
			if (val == null)
			{
				shouldFindChars.put(i, 1);
			} else
			{
				shouldFindChars.put(i, val + 1);
			}
		}

		int count = 0;
		int slidingIndex = 0;
		int minWindow = Integer.MAX_VALUE;
		int finish = 0;
		int start = 0;
		for (int i = 0; i < mainArray.length; i++)
		{
			if (!shouldFindChars.containsKey(mainArray[i]))
			{
				continue;
			}

			Integer v = hasFoundChars.get(mainArray[i]);
			hasFoundChars.put(mainArray[i], v == null ? 1 : v + 1);

			if (hasFoundChars.get(mainArray[i]) <= shouldFindChars
					.get(mainArray[i]))
			{
				count++;
			}

			if (count == intsToCheck.length)
			{
				while (shouldFindChars.get(mainArray[slidingIndex]) == null
						|| hasFoundChars.get(mainArray[slidingIndex]) > shouldFindChars.get(mainArray[slidingIndex]))
				{
					if (shouldFindChars.get(mainArray[slidingIndex]) == null)
					{

					} else if (hasFoundChars.get(mainArray[slidingIndex]) > shouldFindChars
							.get(mainArray[slidingIndex]))
					{
						v = hasFoundChars.get(mainArray[slidingIndex]);
						hasFoundChars.put(mainArray[slidingIndex], v - 1);
					}
					slidingIndex++;
				}
				if (minWindow > i - slidingIndex + 1)
				{
					minWindow = i - slidingIndex + 1;
					finish = i;
					start = slidingIndex;
				}
			}
		}
		System.out.println(minWindow + " " + start + " " + finish);
	}
}
