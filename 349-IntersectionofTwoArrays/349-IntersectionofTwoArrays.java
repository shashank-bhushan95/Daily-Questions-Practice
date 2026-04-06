// Last updated: 4/6/2026, 3:12:12 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashSet<Integer> ans = new HashSet<>();
4        HashSet<Integer> nums = new HashSet<>();
5        for(int i = 0; i < nums1.length; i++) nums.add(nums1[i]);
6        for(int i = 0; i < nums2.length; i++){
7            if(nums.contains(nums2[i])) ans.add(nums2[i]);
8        }
9
10        int n = ans.size();
11        int index = 0;
12        int[] ansArray = new int[n];
13        for (int num : ans) {
14            ansArray[index++] = num;
15        }
16        return ansArray;
17    }
18}