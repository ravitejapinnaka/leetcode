public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int n=A.length,count=0;
        Map<Integer,Integer> map=new HashMap<>();
        int k1=0,k2=0,c1,c2;
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        {
            c1=A[i]+B[j];
            if(!(map.containsKey(c1)))
            map.put(c1,1);
            else
            map.put(c1,map.get(c1)+1);
        }
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        {
            c2=-(C[i]+D[j]);
            if(map.containsKey(c2))
            count+=map.get(c2);
            
        }
        
        return count;
        
        
    }
}