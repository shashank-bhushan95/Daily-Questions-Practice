// Last updated: 4/4/2026, 7:57:55 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        // Using Nested Loop
4        int[] ans = {-1, -1};
5        for(int i = 0; i < nums.length; i++){
6            for(int j = i+1; j < nums.length; j++){
7                if(nums[i] + nums[j] == target) {
8                    ans[0] = i;
9                    ans[1] = j;
10                    return ans;
11                }
12            }
13        }
14        return ans;
15    }
16}