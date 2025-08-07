// Last updated: 8/7/2025, 10:04:03 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0; 
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];

            if(sum > ans){
                ans = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}