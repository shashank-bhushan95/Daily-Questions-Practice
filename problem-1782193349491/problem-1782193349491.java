// Last updated: 6/23/2026, 11:12:29 AM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        Arrays.sort(nums);
4        ArrayList<Integer> a = new ArrayList<>(); 
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] == target) a.add(i);
7            if(nums[i] > target) break;
8        }
9        return a;
10    }
11}