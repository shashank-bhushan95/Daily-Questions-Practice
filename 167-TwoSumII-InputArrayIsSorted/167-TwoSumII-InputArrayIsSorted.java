// Last updated: 4/7/2026, 8:09:35 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int[] ans = {-1, -1};
4        // for(int i = 0; i < nums.length; i++){
5        //     for(int j = i+1; j < nums.length; j++){
6        //         int sum = nums[i] + nums[j];
7        //         if(sum == target){
8        //             ans[0] = i+1;
9        //             ans[1] = j+1;
10        //             return ans;
11        //         }
12        //     }
13        // }
14        // return ans;
15
16
17        int i = 0;
18        int j = nums.length-1;
19        while(i < j){
20            int sum = nums[i] + nums[j];
21            if(sum < target) i++;
22            else if(sum > target) j--;
23            else{
24                ans[0] = i+1;
25                ans[1] = j+1;
26                return ans;
27            }
28        }
29        return ans;
30    }
31}