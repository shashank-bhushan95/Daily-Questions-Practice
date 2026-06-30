// Last updated: 6/30/2026, 10:28:03 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] ans = {-1, -1};
4        for(int i = 0; i < nums.length; i++){
5            if(nums[i] == target && ans[0] == -1) ans[0] = i;
6            if(nums[i] == target) ans[1] = i;
7        }
8        return ans;
9    }
10}