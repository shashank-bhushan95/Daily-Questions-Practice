// Last updated: 6/28/2026, 1:00:25 AM
1class Solution {
2    public List<Integer> targetIndices(int[] nums, int target) {
3        Arrays.sort(nums);
4        ArrayList<Integer> a = new ArrayList<>(); 
5        for(int i = 0; i < nums.length; i++){
6            if(nums[i] == target) a.add(i);
7        }
8        return a;
9    }
10}