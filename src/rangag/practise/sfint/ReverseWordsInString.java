package rangag.practise.sfint;

public class ReverseWordsInString
{
	public static void main(String[] args)
	{
		StringBuffer s = new StringBuffer("I am a 	Good boy");
		ReverseWords(s);
	}

	private static void ReverseWords(StringBuffer s)
	{
		ReverseString(s, 0, s.length() - 1);
		int beginIndex = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == '\t')
			{
				ReverseString(s, beginIndex, i - 1);

				beginIndex = i + 1;
			}
		}
		System.out.println(s);
	}

	private static void ReverseString(StringBuffer s, int start, int end)
	{
		if (start >= end)
		{
			return;
		}
		char temp = s.charAt(end);
		s.setCharAt(end, s.charAt(start));
		s.setCharAt(start, temp);
		ReverseString(s, ++start, --end);
	}
}
