// Last updated: 6/18/2026, 9:09:03 AM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        // int count = 0;
4        // int[] ans = new int[nums.length];
5        // for(int i = 0; i < nums.length; i++){
6        //     if(nums[i] == 0) count++;
7        // }
8
9        // int index = 0;
10        // for(int i = 0; i < nums.length; i++){
11        //     if(nums[i] != 0){
12        //         ans[index++] = nums[i];
13        //     }
14        // }
15
16        // for(int i = 0; i < count; i++){
17        //     ans[index++] = 0;
18        // }
19
20        // for(int i = 0; i < nums.length; i++){
21        //     nums[i] = ans[i];
22        // }
23
24        int count = 0;
25        int index = 0;
26        for(int i = 0; i < nums.length; i++){
27            if(nums[i] != 0){
28                nums[index++] = nums[i];
29            }
30        }
31
32        count = nums.length - index;
33
34        for(int i = 0; i < count; i++){
35            nums[index++] = 0;
36        }
37    }
38}