// Last updated: 8/2/2026, 7:22:47 PM
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        int[] sort = nums.clone();
4        Arrays.sort(sort);
5        boolean asc = true;
6        boolean des = true;
7        for(int i = 0; i < nums.length; i++){
8            if(nums[i] != sort[i]) asc = false;
9            if(nums[i] != sort[nums.length-i-1]) des = false;
10        }
11        return asc || des;
12    }
13}