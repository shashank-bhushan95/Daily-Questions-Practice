// Last updated: 4/7/2026, 8:02:52 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int[] ans = {-1, -1};
4        for(int i = 0; i < nums.length; i++){
5            for(int j = i+1; j < nums.length; j++){
6                int sum = nums[i] + nums[j];
7                if(sum == target){
8                    ans[0] = i+1;
9                    ans[1] = j+1;
10                    return ans;
11                }
12            }
13        }
14        return ans;
15    }
16}