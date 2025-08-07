// Last updated: 8/7/2025, 10:03:25 PM
class Solution {
    public static int logic(int[] nums, int target, int start, int end){
        if(start > end) return -1;
        int mid = (start+end)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] < target){
            return logic(nums,target,mid+1,end);
        }
        else{
            return logic(nums,target,start,mid-1);
        }
    }
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        
        return logic(nums,target,start,end);
    }
}