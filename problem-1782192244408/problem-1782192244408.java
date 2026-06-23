// Last updated: 6/23/2026, 10:54:04 AM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        if(nums.length < k) return 0;
4        double max = Integer.MIN_VALUE;
5        for(int i = 0; i < nums.length-k+1; i++){
6            int sum = 0;
7            for(int j = i; j < i+k; j++){
8                sum = sum + nums[j];
9            }
10            max = Math.max(max, sum);
11        }
12        double avg = max / k;
13        return avg;
14    }
15}