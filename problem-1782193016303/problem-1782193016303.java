// Last updated: 6/23/2026, 11:06:56 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        if(nums.length < k) return 0;
4        int winSum = 0;
5        for(int i = 0; i < k; i++){
6            winSum = winSum + nums[i];
7        }
8
9        double maxSum = winSum;
10        for(int i = k; i < nums.length; i++){
11            winSum = winSum + nums[i] - nums[i-k];
12            maxSum = Math.max(winSum, maxSum);
13        }
14
15        double avg = maxSum / k;
16        return avg;
17    }
18}