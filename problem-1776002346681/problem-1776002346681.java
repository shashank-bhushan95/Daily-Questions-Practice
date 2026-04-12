// Last updated: 4/12/2026, 7:29:06 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3       // int[] ans = new int[nums.length];
4        
5
6        for(int i = 0; i < nums.length; i++){
7            int max = Integer.MAX_VALUE;
8            for(int j = i+1; j < nums.length; j++){
9                int sqI = nums[i] * nums[i];
10                int sqJ = nums[j] * nums[j];
11                if(sqI > sqJ){
12                    if(max > sqJ){
13                        int temp = nums[i];
14                        nums[i] = nums[j];
15                        nums[j] = temp;
16                        max = nums[j]*nums[j];
17                    }
18                }
19            }
20            nums[i] = nums[i] * nums[i];
21        }
22        return nums;
23    }
24}