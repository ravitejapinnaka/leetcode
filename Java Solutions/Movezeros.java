public class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;
        for(i=0,j=0;j<nums.length-1;)
        {
            if(nums[i]!=0)
                i++;
            j++;
            nums[i]=nums[j];
        }
        for(int k=i+1;k<nums.length;k++)
        {
            nums[k]=0;
        }
    }
}