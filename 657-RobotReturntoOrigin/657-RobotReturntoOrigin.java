// Last updated: 7/19/2026, 3:14:18 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n*2];
5        for(int i = 0; i < n; i++){
6            ans[i] = nums[i];
7            ans[i+n] = nums[i];
8        }
9        return ans;
10    }
11}