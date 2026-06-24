// Last updated: 6/24/2026, 11:17:38 AM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int len = nums.length;
5        int last = nums[len-1] * nums[len-2] * nums[len-3];
6        int start = nums[0] * nums[1] * nums[len-1];
7        return Math.max(last, start);
8        
9    }
10}