// Last updated: 6/21/2026, 12:34:21 PM
1class Solution {
2    public int[][] matrixReshape(int[][] mat, int r, int c) {
3        if((mat.length * mat[0].length) != (r * c)) return mat;
4        int[][] ans = new int[r][c];
5        int row = 0;
6        int column = 0;
7        for(int i = 0; i < mat.length; i++){
8            for(int j = 0; j < mat[0].length; j++){
9                if(column == c){
10                    row++;
11                    column = 0;
12                    ans[row][column] = mat[i][j];
13                    column++;
14
15                }
16                else{
17                    ans[row][column] = mat[i][j];
18                    column++;
19                }
20            }
21        }
22        return ans;
23    }
24}