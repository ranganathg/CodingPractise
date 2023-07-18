package rangag.practise.lc;

/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        int[] result = new int[length];
        int left = 0;
        int right = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (nums[left] > nums[right]) {
                result[i] = nums[left];
                left++;
            } else {
                result[i] = nums[right];
                right--;
            }
        }
        return result;
    }
}
