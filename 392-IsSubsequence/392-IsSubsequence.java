// Last updated: 7/11/2026, 1:55:59 PM
1class Solution {
2    public int[] sortArrayByParity(int[] nums) {
3        int i = 0;
4        int j = nums.length-1;
5        while(i < j){
6            if(nums[i] % 2 != 0 && nums[j] % 2 == 0){
7                int temp = nums[i];
8                nums[i] = nums[j];
9                nums[j] = temp;
10                i++;
11                j--;
12            }
13            else if(nums[i] % 2 == 0) i++;
14            else if(nums[j] % 2 == 1) j--;
15        }
16        return nums;
17    }
18}