// Last updated: 12/2/2025, 9:38:28 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        char[] str1 = text1.toCharArray();
4        char[] str2 = text2.toCharArray();
5        int temp[][] = new int[str1.length + 1][str2.length + 1];
6        int max = 0;
7        for(int i = 1; i < temp.length; i++){
8            for(int j = 1; j < temp[i].length; j++){
9                if(str1[i-1] == str2[j-1]){
10                    temp[i][j] = temp[i-1][j-1] + 1;
11                }
12                else{
13                    temp[i][j] = Math.max(temp[i][j-1], temp[i-1][j]);
14                }
15                if(temp[i][j] > max){
16                    max = temp[i][j];
17                }
18            }
19        }
20        return max;
21    }
22}