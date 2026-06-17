// Last updated: 6/18/2026, 12:23:02 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int curr = 0;
4        int befo = -1;
5        int ans = 0;
6    
7        for(int i = 0; i < nums.length; i++){
8            
9            if(nums[i] == 1){
10                int one = curr - befo;
11                if(one > ans) ans = one;
12                curr++;
13            }
14            else{
15                curr++;
16                befo = i;
17            }
18        }
19        return ans;
20    }
21}