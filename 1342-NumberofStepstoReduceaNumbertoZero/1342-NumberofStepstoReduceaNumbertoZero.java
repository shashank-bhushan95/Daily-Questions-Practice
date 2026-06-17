// Last updated: 6/17/2026, 10:33:37 AM
1class Solution {
2    public int findNumbers(int[] nums) {
3        // N^2
4        // int ans = 0;
5        // for(int i = 0; i < nums.length; i++){
6        //     int count = 0;
7        //     while(nums[i] > 0){
8        //         nums[i] = nums[i] / 10;
9        //         count++;
10        //     }
11        //     if(count % 2 == 0){
12        //         ans++;
13        //     }
14        // }
15        // return ans;
16
17        int count = 0;
18        for(int i = 0; i < nums.length; i++){
19            int digit =(int) Math.log10(nums[i]) + 1;
20            if(digit % 2 == 0) count++;
21        }
22        return count;
23    }
24}