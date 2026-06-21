// Last updated: 6/21/2026, 1:11:14 PM
1class Solution {
2    public int[][] construct2DArray(int[] original, int m, int n) {
3        
4        if(original.length != (m*n)) return new int[0][0];
5        int[][] ans = new int[m][n];
6        for(int i = 0; i < original.length; i++){
7            ans[i/n][i%n] = original[i];
8        }
9        return ans;
10
11    }
12}