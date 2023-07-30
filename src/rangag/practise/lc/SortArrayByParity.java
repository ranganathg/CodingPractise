package rangag.practise.lc;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                swap(nums, i++, j);
            }
        }
        return nums;
    }

    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
