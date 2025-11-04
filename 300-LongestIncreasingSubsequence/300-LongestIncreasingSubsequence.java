// Last updated: 11/4/2025, 9:37:54 AM
// class Solution {
//     public static int solve(int[] nums, int idx, int prev){
//         if(idx == nums,length) return 0;
//         int include = 0;
//         int exclude = 0;
//         if(prev == -1 || nums)
//     }
//     public int lengthOfLIS(int[] nums) {
//         int prev = -1;
//         return solve(nums,0,prev);
//     }
// }

class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int ans = 1;
        for(int i = 1; i < dp.length; i++){
            int max = 0;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    max = Math.max(max, dp[j]);

                }
            }
            dp[i] = max + 1;
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}