package rangag.practise.leetcode;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.nextLine());
		int firstVal = Integer.parseInt(s.next());
		int secondVal = Integer.parseInt(s.next());
		int thirdVal = Integer.parseInt(s.next());
		int prev = thirdVal;
		int arithmeticDiff = Math.min(Math.abs(secondVal - firstVal),
				Math.abs(thirdVal - secondVal));
		if (Math.abs(secondVal - firstVal) > Math.abs(thirdVal - secondVal)) {
			System.out.println(firstVal + arithmeticDiff);
			return;
		} else if (Math.abs(thirdVal - secondVal) > Math.abs(secondVal
				- firstVal)) {
			System.out.println(secondVal + arithmeticDiff);
			return;
		}
		for (int i = 3; i < N; i++) {
			if (s.hasNext()) {
				int l = Integer.parseInt(s.next());
				System.out.println(l);
				if (Math.abs(l - prev) > arithmeticDiff) {
					System.out.println(prev + arithmeticDiff);
					return;
				}
				prev = l;
			} else {
				System.out.println(prev + arithmeticDiff);
			}
		}
		s.close();
	}
}