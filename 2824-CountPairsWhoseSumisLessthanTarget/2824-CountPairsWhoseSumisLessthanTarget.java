// Last updated: 4/10/2026, 9:29:16 PM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        int ans = 0;
4        for(int i = 0; i < nums.size(); i++){
5            for(int j = i+1; j < nums.size(); j++){
6                if(nums.get(i) + nums.get(j) < target) ans++;
7            }
8        }
9
10        return ans;
11    }
12}