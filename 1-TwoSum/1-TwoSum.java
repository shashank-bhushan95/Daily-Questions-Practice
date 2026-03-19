// Last updated: 3/19/2026, 11:34:17 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        // Map<Integer,Integer> map = new HashMap<>();
4        // int ans[] = {-1,-1};
5        // for(int i = 0; i < nums.length; i=i+1){
6        //     int diff = target - nums[i];
7        //     if(map.containsKey(diff)){
8        //         ans[0] = i;
9        //         ans[1] = map.get(diff);
10        //         return ans;
11        //     }
12            
13        //     map.put(nums[i],i);
14        // }
15
16        int[] ans = {-1,-1};
17        for(int i = 0; i < nums.length-1; i++){
18            for(int j = i+1; j < nums.length; j++){
19                if(nums[i] + nums[j] == target){
20                    ans[0] = i;
21                    ans[1] = j;
22                    return ans;
23                }
24            }
25        }
26        return ans;
27    }
28}