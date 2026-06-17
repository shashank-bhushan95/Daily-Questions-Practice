// Last updated: 6/17/2026, 1:09:32 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        Arrays.sort(nums);
4        for(int i = 0; i < nums.length; i++){
5            if(nums[i] != i) return i;
6        }
7        return nums.length;
8    }
9}