// Last updated: 1/27/2026, 10:26:31 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int i = 0;
4        int j = nums.length -1;
5        int k = nums.length - 1;
6        int[] ans = new int[nums.length];
7
8        while(i <= j){
9            if(Math.abs(nums[i]) > Math.abs(nums[j])){
10                ans[k] = nums[i] * nums[i];
11                i++;
12            }
13            else{
14                ans[k] = nums[j] * nums[j];
15                j--;
16            }
17            k--;
18        }
19        return ans;
20    }
21}