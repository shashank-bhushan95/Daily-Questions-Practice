// Last updated: 8/6/2026, 10:22:12 PM
1class Solution {
2    public int largestPerimeter(int[] nums) {
3        Arrays.sort(nums);
4        int fir = nums.length-3;
5        int sec = nums.length-2;
6        int thi = nums.length-1;
7        while(fir >= 0){
8            if((nums[fir] + nums[sec]) > nums[thi]){
9                return nums[fir] + nums[sec] + nums[thi];
10            }
11            fir--;
12            sec--;
13            thi--;
14        }
15        return 0;
16    }
17}