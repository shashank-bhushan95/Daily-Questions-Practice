// Last updated: 6/24/2026, 11:18:56 AM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int last = nums[n-1] * nums[n-2] * nums[n-3];
6        int start = nums[0] * nums[1] * nums[n-1];
7        return Math.max(last, start);
8        
9    }
10}