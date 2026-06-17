// Last updated: 6/17/2026, 1:18:54 PM
1class Solution {
2    public int missingNumber(int[] nums) {
3        // Arrays.sort(nums);
4        // for(int i = 0; i < nums.length; i++){
5        //     if(nums[i] != i) return i;
6        // }
7        // return nums.length;
8
9        int n = nums.length;
10        int sum = (n*(n+1))/2;
11        int sumArray = 0;
12        for(int i = 0; i < nums.length; i++){
13            sumArray = sumArray + nums[i];
14        }
15        int ans = sum - sumArray;
16        return ans;
17
18    }
19}