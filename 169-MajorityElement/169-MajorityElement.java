// Last updated: 6/18/2026, 12:46:06 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int count = 0;
4        int[] ans = new int[nums.length];
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] == 0) count++;
7        }
8
9        int index = 0;
10        for(int i = 0; i < nums.length; i++){
11            if(nums[i] != 0){
12                ans[index++] = nums[i];
13            }
14        }
15
16        for(int i = 0; i < count; i++){
17            ans[index++] = 0;
18        }
19
20        for(int i = 0; i < nums.length; i++){
21            nums[i] = ans[i];
22        }
23    }
24}