// Last updated: 6/30/2026, 10:04:45 PM
1class Solution {
2    public int projectionArea(int[][] grid) {
3        int area = 0;
4        for(int i = 0; i < grid.length; i++){
5            int maxRow = 0;
6            int maxCol = 0;
7            for(int j = 0; j < grid[0].length; j++){
8                if(grid[i][j] > 0) area++;
9                maxRow = Math.max(grid[i][j], maxRow);
10                maxCol = Math.max(maxCol, grid[j][i]);
11            }
12            area = area + maxRow + maxCol;
13        }
14
15        return area;
16    }
17}