// Last updated: 1/18/2026, 11:26:54 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer,Integer> map = new HashMap<>();
4        int[] ans = {-1,-1};
5
6        for(int i = 0; i < nums.length; i++){
7            int search = target-nums[i];
8
9            if(map.containsKey(search)){
10                ans[0] = map.get(search);
11                ans[1] = i;
12                return ans;
13            }
14
15            else{
16                map.put(nums[i],i);
17            }
18        }
19        return ans;
20    }
21}