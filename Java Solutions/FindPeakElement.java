public class Solution {
    public int findPeakElement(int[] nums) {
        int low=0, high=nums.length-1,mid;
        if(nums.length==1)
            return 0;
        else if(nums.length==2)
            return(nums[0]>nums[1] ? nums[0] : nums[1]);
        mid= low + (high-low)/2;int t1,t2;
        while(mid <nums.length && mid>-1)
        {
        
            if(mid ==nums.length)
                return nums.length-1;
            if(mid== -1)
                return 0;
            if(mid+1==nums.length)
                t2 = Integer.MIN_VALUE;
            else
                t2= nums[mid+1];
            if(mid-1==-1)
                t1 = Integer.MIN_VALUE;
            else
                t1= nums[mid-1];
        if(nums[mid]>t2 && nums[mid] > t1)
            return mid;
        else if(nums[mid]> t2 && t1 > nums[mid])
        high=mid-1;
        else
            low=mid+1;
            mid= low + (high-low)/2;
        }
        return 1;
    }
}