// Last updated: 6/24/2026, 4:26:36 PM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3        ArrayList<String> ans = new ArrayList<>();
4        int start = 0;
5        if (nums == null || nums.length == 0) return ans;
6        for(int i = 0; i < nums.length; i++){
7            if(nums.length-1 == i || nums[i+1] != nums[i]+1){
8                int end = i;
9                if (start == end) {
10                    ans.add(String.valueOf(nums[start]));
11                }
12                else {
13                    ans.add(nums[start] + "->" + nums[end]);
14                }
15                start = i + 1;
16            }
17        }
18        return ans;
19        
20    }
21}