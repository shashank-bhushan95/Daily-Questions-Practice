// Last updated: 6/17/2026, 10:18:22 AM
1class Solution {
2    public int findNumbers(int[] nums) {
3        
4        int ans = 0;
5        for(int i = 0; i < nums.length; i++){
6            int count = 0;
7            while(nums[i] > 0){
8                nums[i] = nums[i] / 10;
9                count++;
10            }
11            if(count % 2 == 0){
12                ans++;
13            }
14        }
15        return ans;
16    }
17}