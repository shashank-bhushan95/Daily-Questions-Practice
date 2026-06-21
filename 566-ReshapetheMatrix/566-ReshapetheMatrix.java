// Last updated: 6/21/2026, 12:52:34 PM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        int[][] ans = new int[r][c];
4        if((mat.length * mat[0].length) != (r * c)) return mat;
5        for(int i = 0; i < (mat.length * mat[0].length); i++){
6            ans[i/c][i%c] = mat[i/mat[0].length][i%mat[0].length];
7        }
8        return ans;
9    }
10}