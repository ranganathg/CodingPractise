package rangag.practise.lc;

public class EvenDigitCount {
    public int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for (int num : nums) {
            int digitCount = getDigitCount(num);
            if (digitCount % 2 == 0)
                evenDigitCount++;
        }
        return evenDigitCount;
    }

    private int getDigitCount(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
