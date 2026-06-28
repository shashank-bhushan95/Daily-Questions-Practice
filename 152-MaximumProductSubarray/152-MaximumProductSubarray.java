// Last updated: 6/28/2026, 2:28:02 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int maxProduct = nums[0];
4        int minProduct = nums[0];
5        int ans = nums[0];
6        for (int i = 1; i < nums.length; i++) {
7            int tempMax = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
8            minProduct = Math.min(nums[i], Math.min(maxProduct * nums[i], minProduct * nums[i]));
9            maxProduct = tempMax;
10            ans = Math.max(ans, maxProduct);
11        }
12
13        return ans;
14    }
15}