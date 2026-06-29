// Last updated: 6/29/2026, 10:53:07 PM
1class Solution {
2    public int dominantIndex(int[] nums) {
3        int max = nums[0];
4        int index = 0;
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] > max){
7                max = nums[i];
8                index = i;
9            }
10        }
11
12        for(int i = 0; i < nums.length; i++){
13            if(nums[i]*2 > max && i != index) index = -1;
14        }
15        return index;
16    }
17}