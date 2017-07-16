public class Solution {
    public int rob(int[] nums) {
        int []T= new int[nums.length+1];
        if(nums.length==0){
            return(0);
        }
        if(nums.length==1){
            //T[0]=nums[0];
            return(nums[0]);
        }
        else{
            T[0]=0;
            T[1]= nums[0];
            T[2]= nums[1];
            for(int i=3; i<= nums.length ; i++){
                T[i]= max(T[i-2],T[i-3]) + nums[i-1];
        }
            }
        return max(T[nums.length-1],T[nums.length]);
        }
    
    public int max(int a1, int a2){
        return(a1 > a2 ? a1 : a2);
    }
            
    
}