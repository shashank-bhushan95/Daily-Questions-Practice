// Last updated: 4/4/2026, 10:13:21 PM
1class Solution {
2    public int countOdds(int low, int high) {
3        int ans = (high + 1) / 2 - (low / 2);
4        return ans;
5    }
6}