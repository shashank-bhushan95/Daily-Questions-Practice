// Last updated: 7/15/2026, 12:27:57 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        Arrays.sort(nums1);
4        Arrays.sort(nums2);
5        ArrayList<Integer> arr = new ArrayList<>();
6
7        int i = 0;
8        int j = 0;
9        while(i < nums1.length && j < nums2.length){
10            if(nums1[i] == nums2[j]){ 
11                arr.add(nums1[i]);
12                i++;
13                j++;
14            }
15            
16            else if(nums1[i] > nums2[j]){
17                j++;
18            }
19            else if(nums1[i] < nums2[j]){
20                i++;
21            }
22        }
23
24        int[] ans = new int[arr.size()];
25        int index = 0;
26        for(int num : arr){
27            ans[index++] = num;
28        }
29
30        return ans;
31    }
32}