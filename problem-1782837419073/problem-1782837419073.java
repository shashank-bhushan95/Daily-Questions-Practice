// Last updated: 6/30/2026, 10:06:59 PM
1class Solution {
2    public int projectionArea(int[][] grid) {
3        int area = 0;
4        int n = grid.length;
5        for(int i = 0; i < n; i++){
6            int maxRow = 0;
7            int maxCol = 0;
8            for(int j = 0; j < n; j++){
9                if(grid[i][j] > 0) area++;
10                maxRow = Math.max(grid[i][j], maxRow);
11                maxCol = Math.max(maxCol, grid[j][i]);
12            }
13            area = area + maxRow + maxCol;
14        }
15
16        return area;
17    }
18}