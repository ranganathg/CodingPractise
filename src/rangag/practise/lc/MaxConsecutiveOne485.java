package rangag.practise.lc;

public class MaxConsecutiveOne485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        for (int num : nums) {
            if (num == 1) count++;
            else {
                if (maxCount < count) maxCount = count;
                count = 0;
            }
        }
        return Math.max(maxCount, count);
    }
}
