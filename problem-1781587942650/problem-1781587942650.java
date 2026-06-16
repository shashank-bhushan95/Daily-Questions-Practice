// Last updated: 6/16/2026, 11:02:22 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet<Integer> ans = new HashSet<>();
4        for(int i = 0; i < nums.length; i++){
5            if(ans.contains(nums[i])) return true;
6            ans.add(nums[i]);
7        }
8
9        return false;
10    }
11}