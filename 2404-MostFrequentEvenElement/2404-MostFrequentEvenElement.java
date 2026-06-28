// Last updated: 6/28/2026, 11:26:09 PM
1class Solution {
2    public int mostFrequentEven(int[] nums) {
3        Arrays.sort(nums);
4        int ans = -1;
5        int maxFreq = 0;
6        int i = 0;
7        while (i < nums.length) {
8            int count = 1;
9            int num = nums[i];
10
11            while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
12                count++;
13                i++;
14            }
15            if (num % 2 == 0) {
16                if (count > maxFreq) {
17                    maxFreq = count;
18                    ans = num;
19                }
20            }
21            i++;
22        }
23        return ans;
24    }
25}   