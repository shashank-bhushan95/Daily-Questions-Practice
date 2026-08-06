// Last updated: 8/6/2026, 9:58:38 PM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        for (int num : nums) {
5            map.put(num, map.getOrDefault(num, 0) + 1);
6            if (map.get(num) == nums.length / 2) {
7                return num;
8            }
9        }
10        return -1;
11    }
12}