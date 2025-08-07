// Last updated: 8/7/2025, 10:03:28 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int result[] = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int index = -1;
            int nums = nums1[i];
            for(int j = 0; j < nums2.length; j++){
                if(nums == nums2[j]){
                    index = j;
                    break;
                }
            }
            result[i] = -1;
            for(int k = index+1; k < nums2.length; k++){
                if(nums2[k] > nums){
                    result[i] = nums2[k];
                    break;
                }
            }
        }
        return result;
    }
}