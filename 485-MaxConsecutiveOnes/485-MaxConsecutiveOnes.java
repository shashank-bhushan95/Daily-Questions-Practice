// Last updated: 6/15/2026, 10:26:46 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int x = 0;
4        int y = -1;
5        int ans = 0;
6        for(int i = 0; i < nums.length; i++){
7            if(nums[i] == 1){
8                int max = x-y;
9                if(max > ans){
10                    ans = max;
11                }
12            }
13            else{
14                y = i;
15            }
16            x++;
17        }
18        return ans;
19    }
20}