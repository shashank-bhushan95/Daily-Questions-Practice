// Last updated: 7/9/2026, 9:57:36 AM
1class Solution {
2    public int search(int[] nums, int target) {
3        int i = 0;
4        int j = nums.length-1;
5        
6        while(i <= j){
7            int mid = (i+j)/2;
8            if(nums[mid] == target) return mid;
9            if (nums[i] <= nums[mid]) { // left 
10                if (target >= nums[i] && target < nums[mid]) {
11                    j = mid - 1; 
12                } 
13                else {
14                    i = mid + 1;
15                }
16            }
17            else {
18                if (target > nums[mid] && target <= nums[j]) {
19                    i = mid + 1;
20                } 
21                else {
22                    j = mid - 1;
23                }
24            }
25        }
26        return -1;
27    }
28}