// Last updated: 8/6/2026, 9:52:58 PM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        Arrays.sort(nums);
4        
5        int j = 0;
6        for(int i = 0; i < nums.length; i++){
7            if(nums[i] != nums[j]){
8                int freq = i - j;
9                if(freq >= nums.length/2) return nums[j];
10                j = i;
11            }
12        }
13        int freq = nums.length-j;
14        if(freq == nums.length/2) return nums[j];
15        return -1;
16    }
17}