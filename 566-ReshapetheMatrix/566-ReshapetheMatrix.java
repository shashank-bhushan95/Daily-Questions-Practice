// Last updated: 6/21/2026, 1:08:05 PM
1class Solution {
2    public int[][] construct2DArray(int[] original, int m, int n) {
3        int[][] ans = new int[m][n];
4        if(original.length != (m*n)) return new int[0][0];
5        for(int i = 0; i < original.length; i++){
6            ans[i/n][i%n] = original[i];
7        }
8        return ans;
9
10    }
11}