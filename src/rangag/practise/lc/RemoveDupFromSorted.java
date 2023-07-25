package rangag.practise.lc;

public class RemoveDupFromSorted {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int len=nums.length;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }

    public int removeDuplicates2(int[] nums) {
        int i=1;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j-1]!=nums[j])
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
