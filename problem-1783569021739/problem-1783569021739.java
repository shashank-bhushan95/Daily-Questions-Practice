// Last updated: 7/9/2026, 9:20:21 AM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int row = matrix.length;
4        int column = matrix[0].length;
5        int[][] ans = new int[column][row];
6        int index = 0;
7
8        for(int i = 0; i < row; i++){
9            for(int j = 0; j < column; j++){
10                ans[j][i] = matrix[i][j];
11            }
12        }
13
14        return ans;
15    }
16}