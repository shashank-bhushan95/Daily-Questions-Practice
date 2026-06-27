// Last updated: 6/28/2026, 12:36:42 AM
1class Solution {
2    public int islandPerimeter(int[][] grid) {
3        int ans = 0;
4        int row = grid.length;
5        int col = grid[0].length;
6        for(int i = 0; i < row; i++){
7            for(int j  = 0; j < col; j++){
8                if(grid[i][j] == 1){
9                    if(i == 0 || grid[i-1][j] == 0) ans++;
10                    if(j == 0 || grid[i][j-1] == 0) ans++;
11                    if(i == row-1 || grid[i+1][j] == 0) ans++;
12                    if(j == col-1 || grid[i][j+1] == 0) ans++;
13                }
14            }
15        }
16        return ans;
17    }
18}