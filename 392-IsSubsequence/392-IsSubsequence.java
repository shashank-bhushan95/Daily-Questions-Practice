// Last updated: 7/11/2026, 2:24:16 PM
1class Solution {
2    public int[] applyOperations(int[] nums) {
3        for(int i = 0; i < nums.length-1; i++){
4            if(nums[i] == nums[i+1]){
5                nums[i] = nums[i] * 2;
6                nums[i+1] = 0;
7            }
8        }
9
10        int k = 0;
11        for(int i = 0; i < nums.length; i++){
12            if(nums[i] != 0){
13                int temp = nums[i];
14                nums[i] = nums[k];
15                nums[k] = temp;
16                k++;
17            }
18        }
19        return nums;
20    }
21}