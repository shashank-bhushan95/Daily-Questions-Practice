// Last updated: 4/11/2026, 10:54:14 AM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        // int ans = 0;
4        // for(int i = 0; i < nums.size(); i++){
5        //     for(int j = i+1; j < nums.size(); j++){
6        //         if(nums.get(i) + nums.get(j) < target) ans++;
7        //     }
8        // }
9
10        // return ans;
11
12        int ans = 0;
13        int i = 0, j = nums.size()-1;
14        Collections.sort(nums);
15        while(i < j){
16            int sum = nums.get(i) + nums.get(j);
17            if(sum < target){
18                ans += (j-i);
19                i++;
20            }
21            else{
22                j--;
23            }
24        }
25        return ans;
26    }
27}