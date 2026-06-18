// Last updated: 6/18/2026, 10:40:59 AM
1class Solution {
2    public int[] applyOperations(int[] nums) {
3        int[] ans = new int[nums.length];
4        int index = 0;
5        for(int i = 0; i < nums.length-1; i++){
6            if(nums[i] == nums[i+1] && nums[i] != 0){
7                nums[i] = nums[i] * 2;
8                nums[i+1] = 0;
9            }
10        }
11
12        for(int i = 0; i < nums.length; i++){
13            if(nums[i] != 0){
14                ans[index++] = nums[i];
15            }
16        }
17        
18        return ans;
19    }
20}