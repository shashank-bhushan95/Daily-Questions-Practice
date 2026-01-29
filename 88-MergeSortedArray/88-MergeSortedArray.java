// Last updated: 1/29/2026, 10:39:21 PM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        Collections.sort(nums);
4        int start = 0;
5        int end = nums.size()-1;
6        int count = 0;
7
8        while(start < end){
9            int sum = nums.get(start) + nums.get(end);
10            if(sum < target){
11                count = count + (end - start);
12                start++;
13            }
14            else{
15                end--;
16            }
17        }
18        return count;
19    }
20}