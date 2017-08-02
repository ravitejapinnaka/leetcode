public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;int []nums1=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            prod*=nums[i];
        }
        if(prod!=0){
            for(int i=0;i<nums.length;i++)
            {
                nums1[i]=prod/nums[i];
            }
        }
        else{          
            for(int i=0;i<nums.length;i++)
            {int prod1=1;
             for(int j=0;j<nums.length;j++) {
                 if(j!=i)
                 prod1=nums[j]*prod1;
             }  
             nums1[i]=prod1;
            }
        }
        return nums1;
    }
}