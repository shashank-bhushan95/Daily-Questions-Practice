// Last updated: 7/11/2026, 3:05:23 PM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        int indx1 = 0;
4        int indx2 = 0;
5        while(indx1 < nums1.length && indx2 < nums2.length){
6            if(nums1[indx1] == nums2[indx2]) return nums1[indx1];
7            else if(nums1[indx1] < nums2[indx2]) indx1++;
8            else if(nums1[indx1] > nums2[indx2]) indx2++;
9        }
10        //while()
11        return -1;
12    }
13}