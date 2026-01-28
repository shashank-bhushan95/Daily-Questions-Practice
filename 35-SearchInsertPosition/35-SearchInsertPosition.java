// Last updated: 1/28/2026, 4:40:47 PM
1// class Solution {
2//     public int ans(int[] nums, int left, int right, int target){
3//         int mid = left + (right-left)/2;
4//         if(nums[mid] == target) return mid;
5//         if(nums[mid] < target) return ans(nums, mid+1, right , target);
6//         if(nums[mid] > target) return ans(nums, left, mid-1, target);
7//         return 0;
8//     }
9//     public int searchInsert(int[] nums, int target) {
10//         int right = nums.length-1;
11//         int left = 0;
12//          return ans(nums, left, right, target);
13//     }
14// }
15
16
17 
18class Solution {
19    public int searchInsert(int[] nums, int target) {
20        int start = 0;
21        int end = nums.length - 1;
22        //int mid = start + (end - start)/2;
23        while(start <= end){
24            int mid = start + (end - start)/2;
25            if(nums[mid] == target) return mid;
26            else if(nums[mid] < target){
27                start = mid + 1;
28            }
29            else{
30                end = mid - 1;
31            }
32        }
33
34       return start;
35    }
36}