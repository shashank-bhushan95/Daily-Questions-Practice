// Last updated: 6/18/2026, 12:14:23 AM
1class Solution {
2    public int majorityElement(int[] nums) {
3        int candidate = 0;
4        int count = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            if (count == 0) {
8                candidate = nums[i];
9            }
10
11            if (nums[i] == candidate) {
12                count++;
13            } else {
14                count--;
15            }
16        }
17
18        return candidate;
19    }
20}