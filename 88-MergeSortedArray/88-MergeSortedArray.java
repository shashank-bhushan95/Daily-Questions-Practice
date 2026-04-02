// Last updated: 4/2/2026, 6:00:05 PM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int i = m-1;
4        int j = n-1;
5        int index = nums1.length-1;
6
7        while(i >= 0 && j >= 0){
8            if(nums1[i] > nums2[j]){
9                nums1[index] = nums1[i];
10                i--;
11                index--;
12            }
13            else{
14                nums1[index] = nums2[j];
15                j--;
16                index--;
17            }
18        }
19
20        while(i >= 0){
21            nums1[index] = nums1[i];
22            i--;
23            index--;
24        }
25
26        while(j >= 0){
27            nums1[index] = nums2[j];
28            j--;
29            index--;
30        }
31    }
32}