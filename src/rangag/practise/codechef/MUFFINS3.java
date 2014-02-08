/***
 * http://www.codechef.com/problems/MUFFINS3
 */
package rangag.practise.codechef;

import java.util.Scanner;

public class MUFFINS3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases = Integer.parseInt(s.nextLine());
		for (int i = 0; i < testCases; i++) {
			int cups = Integer.parseInt(s.nextLine());
			System.out.println((cups / 2) + 1);
		}
		s.close();
	}
}
