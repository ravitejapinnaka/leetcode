public class Solution {
    boolean [][]visited;
    int islands=0,i,j,m,n;
    public int numIslands(char[][] grid) {
        n=grid.length;
        if(n==0)
            return 0;
        m=grid[0].length;
        
        
        visited=  new boolean[m][n];
        for(int p=0;p<m;p++)
            for(int q=0;q<n;q++)
                visited[p][q]=false;
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                if(!visited[i][j])
                {
                    dfs(grid,i,j);
                islands++;
            }
            
        return islands;
    }
    
    public void dfs(char[][] grid, int i,int j)
    {
        
        if(i<0||j<0||i>=n||j>=m || grid[i][j]!='1')
            return;
        
        visited[i][j]= true;
                //System.out.println(i+1);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
        
    }
}

