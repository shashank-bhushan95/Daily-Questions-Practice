// Last updated: 6/20/2026, 5:13:17 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        long m1 = Long.MIN_VALUE;
4        long m2 = Long.MIN_VALUE;
5        long m3 = Long.MIN_VALUE;
6
7        for(int i = 0; i < nums.length; i++){
8            if(m1 == nums[i] || m2 == nums[i] || m3 == nums[i]) continue;
9            if(nums[i] > m1){
10                m3 = m2;
11                m2 = m1;
12                m1 = (long) nums[i];
13            }
14            else if(nums[i] > m2){
15                m3 = m2;
16                m2 = (long) nums[i];
17            }
18            else if(nums[i] > m3){
19                m3 = (long) nums[i];
20            }
21        }
22        if(m3 == Long.MIN_VALUE) return (int) m1;
23        else return (int) m3;
24        
25    }
26}