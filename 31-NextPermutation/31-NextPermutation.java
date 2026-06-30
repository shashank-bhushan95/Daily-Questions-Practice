// Last updated: 6/30/2026, 10:24:00 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int n = nums.length;
4        int idx = -1;
5
6        for (int i = n - 2; i >= 0; i--) {
7            if (nums[i] < nums[i + 1]) {
8                idx = i;
9                break;
10            }
11        }
12
13        if (idx != -1) {
14            for (int i = n - 1; i > idx; i--) {
15                if (nums[i] > nums[idx]) {
16                    int temp = nums[i];
17                    nums[i] = nums[idx];
18                    nums[idx] = temp;
19                    break;
20                }
21            }
22        }
23
24        int i = idx+1;
25        int j = n-1;
26        while(i < j){
27            int temp = nums[i];
28            nums[i] = nums[j];
29            nums[j] = temp;
30            i++;
31            j--;
32        }
33    }
34}