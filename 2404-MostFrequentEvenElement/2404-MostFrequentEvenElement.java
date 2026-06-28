// Last updated: 6/28/2026, 11:58:13 PM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3        HashSet<Integer> h = new HashSet<>();
4        for(int i = 0; i < nums.length; i++){
5            if(h.contains(nums[i])) return true;
6            h.add(nums[i]);
7            if(h.size() > k){
8                h.remove(nums[i-k]);
9            }
10        }
11        return false;
12    }
13}