// Last updated: 8/9/2026, 2:51:55 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int[] copy = heights.clone();
4        Arrays.sort(heights);
5        int ans = 0;
6        for(int i = 0; i < heights.length; i++){
7            if(copy[i] != heights[i]) ans++;
8        }
9        return ans;
10    }
11
12}