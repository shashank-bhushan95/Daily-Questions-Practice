// Last updated: 6/18/2026, 9:47:11 AM
1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int index = 0;
4
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] == val) continue;
7            else{
8                nums[index++] = nums[i];
9            }
10        }
11        return index;
12    }
13}