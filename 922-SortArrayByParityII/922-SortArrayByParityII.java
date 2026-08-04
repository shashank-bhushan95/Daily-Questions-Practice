// Last updated: 8/4/2026, 2:36:55 PM
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int even = 0;
4        int odd = 1;
5        while(even < nums.length && odd < nums.length){
6            if(nums[even] % 2 == 0) even += 2;
7            else if(nums[odd] % 2 != 0) odd += 2;
8            else if(nums[even] % 2 != 0 && nums[odd] % 2 == 0){
9                int temp = nums[even];
10                nums[even] = nums[odd];
11                nums[odd] = temp;
12                even += 2;
13                odd += 2;
14            }
15        }
16        return nums;
17    }
18}