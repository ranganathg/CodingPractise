package rangag.practise.hackerrank;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases = Integer.parseInt(s.nextLine());
		for (int i = 0; i < testCases; i++) {
			String testCase = s.nextLine();
			String[] split = testCase.split(" ");
			int N = Integer.parseInt(split[0]);
			int C = Integer.parseInt(split[1]);
			int M = Integer.parseInt(split[2]);

			int totalChocs = N / C;
			int wrappers = totalChocs;
			while (wrappers >= M) {
				totalChocs += wrappers / M;
				wrappers = (wrappers / M) + (wrappers % M);
			}
			System.out.println(totalChocs);
		}
	}
}
