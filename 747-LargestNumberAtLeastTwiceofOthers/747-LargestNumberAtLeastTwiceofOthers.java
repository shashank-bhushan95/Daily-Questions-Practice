// Last updated: 6/29/2026, 10:46:43 PM
1class Solution {
2    public int dominantIndex(int[] nums) {
3        int[] copy = nums.clone();
4        Arrays.sort(nums);
5        int n = nums.length;
6        if(nums[n-1] >= 2*nums[n-2]){
7            for(int i = 0; i < n; i++){
8                if(copy[i] == nums[n-1]) return i;
9            }
10        }
11        return -1;
12    }
13}