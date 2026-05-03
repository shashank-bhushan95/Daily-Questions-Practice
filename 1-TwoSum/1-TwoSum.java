// Last updated: 5/3/2026, 11:31:14 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        // // Using Nested Loop
4        int[] ans = {-1, -1};
5        for(int i = 0; i < nums.length; i++){
6            for(int j = i+1; j < nums.length; j++){
7                if(nums[i] + nums[j] == target) {
8                    ans[0] = i;
9                    ans[1] = j;
10                    return ans;
11                }
12            }
13        }
14        return ans;
15
16        // Using One LOOP.HashMap.
17    //     HashMap<Integer, Integer> hm = new HashMap<>();
18    //     int[] ans = {-1, -1};
19    //     for(int i = 0; i < nums.length; i++){
20    //         int req = target - nums[i];
21    //         if(hm.containsKey(req) == true){
22    //             ans[0] = hm.get(req);
23    //             ans[1] = i;
24    //             return ans;
25    //         }
26    //         else{
27    //             hm.put(nums[i], i);
28    //         }
29    //     }
30    //     return ans;
31    }
32}