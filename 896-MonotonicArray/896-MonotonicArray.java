// Last updated: 8/2/2026, 7:30:44 PM
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        boolean asc = true;
4        boolean des = true;
5        for(int i = 0; i < nums.length-1; i++){
6            if(nums[i] > nums[i+1]) asc = false;
7            if(nums[i] < nums[i+1]) des = false;
8        }
9        return asc || des;
10    }
11}