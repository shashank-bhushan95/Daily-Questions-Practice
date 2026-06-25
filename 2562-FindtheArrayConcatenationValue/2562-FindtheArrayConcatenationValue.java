// Last updated: 6/25/2026, 10:45:11 AM
1class Solution {
2    public int findFinalValue(int[] nums, int original) {
3        for(int i = 0; i < nums.length; i++){
4            if(nums[i] == original){
5                original = original * 2;
6                i = -1;
7            }
8        }
9        return original;
10    }
11}