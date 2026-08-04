// Last updated: 8/4/2026, 2:37:45 PM
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int even = 0;
4        int odd = 1;
5        while(even < nums.length && odd < nums.length){
6            if(nums[even] % 2 == 0) even += 2;
7            else if(nums[odd] % 2 != 0) odd += 2;
8            else{
9            //(nums[even] % 2 != 0 && nums[odd] % 2 == 0){
10                int temp = nums[even];
11                nums[even] = nums[odd];
12                nums[odd] = temp;
13                even += 2;
14                odd += 2;
15            }
16        }
17        return nums;
18    }
19}