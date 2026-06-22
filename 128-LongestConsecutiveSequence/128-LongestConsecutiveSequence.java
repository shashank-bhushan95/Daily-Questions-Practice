// Last updated: 6/22/2026, 11:02:29 AM
1class Solution {
2    public int findLengthOfLCIS(int[] nums) {
3        if(nums == null || nums.length == 0) return 0;
4        //Arrays.sort(nums);
5        int count = 1;
6        int ans = 1;
7        for(int i = 0; i < nums.length-1; i++){
8            if(nums[i+1] > nums[i]){
9                count++;
10                ans = Math.max(ans, count);
11            }
12            else if(nums[i+1] > nums[i]) continue;
13            else{
14                count = 1;
15            }
16        }
17        return ans;
18    }
19}