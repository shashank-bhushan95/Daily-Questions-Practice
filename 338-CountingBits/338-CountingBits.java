// Last updated: 7/21/2026, 10:10:23 PM
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans = new int[n + 1];
4
5        for (int i = 1; i <= n; i++) {
6            ans[i] = ans[i / 2] + (i % 2);
7        }
8        
9        return ans;
10    }
11}
12