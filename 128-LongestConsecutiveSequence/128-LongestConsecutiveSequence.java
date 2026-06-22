// Last updated: 6/22/2026, 10:34:17 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        if(nums.length == 0) return 0;
4        int count = 1;
5        int max = 1;
6        Arrays.sort(nums);
7        for(int i = 0; i < nums.length-1; i++){
8            if(nums[i+1] - nums[i] == 1){
9                count++;
10                max = Math.max(count, max);
11            }
12            else if(nums[i] == nums[i+1]) continue;
13            if(nums[i+1] - nums[i] > 1){
14                count = 1;
15            }
16        }
17        return max;
18    }
19}