package rangag.practise.leetcode;

/**
 * The purpose of this given a number N find the sum of all the ones in
 * individual numbers in the ranga of 1-N
 * 
 * @author rgovardh
 * 
 */
public class SumOfOnes {
	static long countTracker[] = new long[32];

	public static void main(String[] args) throws Exception {
		int n = 10000000;
		long ret1 = CountOnes(n);
		long ret2 = CountOnesBruteForce(n);
		System.out.println(ret2);
		if (ret1 != ret2) {
			throw new Exception("Invalida calculation");
		}

	}

	private static long CountOnesBruteForce(int n) {
		long totalOnes = 0;
		for (int t = 1; t <= n; t++) {
			int count = 0;
			int i = t;
			while ((i = i & (i - 1)) != 0) {
				count++;
			}
			totalOnes += count + 1;
		}
		return totalOnes;
	}

	// TODO : Here I would be calling initializeTracker everytime when this
	// method is called. For online submission
	// I would make this a constant. One way to avoid this is to not initialize
	// the array and check if it is
	// initialized in this method and accordingly call the method. In that case
	// next question is how to make this
	// thread safe.
	private static long CountOnes(int n) {
		initializeTracker();

		return countOnesRecursive(n);
	}

	private static long countOnesRecursive(int n) {
		if (n == 0)
			return n;
		int x = closestPowerOf2(n);
		int y = getPowerOf2(x);
		return countTracker[y] + countOnesRecursive(n - x) + (n - x + 1);
	}

	private static int getPowerOf2(int n) {
		int count = 0;
		while ((n = n >> 1) != 0) {
			count++;
		}
		return count;
	}

	private static void initializeTracker() {
		countTracker[0] = 0;
		for (int i = 1; i < 32; i++) {
			countTracker[i] = countOnesRecursive((1 << i) - 1);
		}
	}

	private static int closestPowerOf2(int n) {
		int count = 0;
		if ((n & n - 1) == 0) {
			return n;
		}
		while ((n = n >> 1) > 0) {
			count++;
		}
		return (1 << count);
	}
}
