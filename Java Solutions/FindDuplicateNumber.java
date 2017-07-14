public class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length-1;
        for(int i=0;i<n+1;i++)
        {
            if(nums[Math.abs(nums[i])]>0)
            nums[Math.abs(nums[i])]*=-1;
            else
            return Math.abs(nums[i]);
        }
        return 0;
    }
}