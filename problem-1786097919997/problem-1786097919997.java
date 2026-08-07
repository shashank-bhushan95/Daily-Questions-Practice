// Last updated: 8/7/2026, 3:48:39 PM
1class Solution {
2    public int largestSumAfterKNegations(int[] nums, int k) {
3        Arrays.sort(nums);
4        int i = 0;
5        while (i < nums.length && k > 0 && nums[i] < 0) {
6            nums[i] = -nums[i];
7            i++;
8            k--;
9        }
10        Arrays.sort(nums);
11        if (k % 2 == 1) {
12            nums[0] = -nums[0];
13        }
14        int sum = 0;
15        for (int num : nums) {
16            sum += num;
17        }
18        return sum;
19    }
20}