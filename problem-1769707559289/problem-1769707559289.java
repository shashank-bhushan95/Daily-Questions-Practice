// Last updated: 1/29/2026, 10:55:59 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer,Integer> map = new HashMap<>();
4        int ans[] = {-1,-1};
5        for(int i = 0; i < nums.length; i=i+1){
6            int diff = target - nums[i];
7            if(map.containsKey(diff)){
8                ans[0] = i;
9                ans[1] = map.get(diff);
10                return ans;
11            }
12            
13            map.put(nums[i],i);
14        }
15        return ans;
16    }
17}