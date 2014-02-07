/**
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
package rangag.practise.leetcode;

public class SingleNumber {
	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 3, 2 };
		System.out.println(new SingleNumber().singleNumber(a));
	}

	public int singleNumber(int[] A) {
		if (A == null)
			return -1;
		int xor = 0;
		for (int i : A) {
			xor = xor ^ i;
		}
		return xor;
	}
}
