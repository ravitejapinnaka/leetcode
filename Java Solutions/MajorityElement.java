public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],0);
        }        
        for(int i=0;i<n;i++){
            map.put(nums[i],(map.get(nums[i]))+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(nums[i])>n/2)
                return nums[i];
        }
        System.out.println(map.get(nums[2]));
        return 0;
    }
}