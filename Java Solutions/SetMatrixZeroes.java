public class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix[0].length;
        int m=matrix.length;
        int []row= new int[m];
        System.out.println(row[0]);
        int []column=new int[n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(matrix[i][j]==0){
                    row[i]=1;
                    column[j]=1;
                }
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(row[i]==1 || column[j]==1)
                    matrix[i][j]=0;
    }
}