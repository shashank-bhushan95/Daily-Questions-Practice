// Last updated: 1/28/2026, 4:33:39 PM
1class Solution {
2    public static int logic(int[] nums, int target, int start, int end){
3        if(start > end) return -1;
4        int mid = (start+end)/2;
5        if(nums[mid] == target) return mid;
6        else if(nums[mid] < target){
7            return logic(nums,target,mid+1,end);
8        }
9        else{
10            return logic(nums,target,start,mid-1);
11        }
12    }
13    public int search(int[] nums, int target) {
14        int start = 0;
15        int end = nums.length-1;
16        
17        return logic(nums,target,start,end);
18    }
19}