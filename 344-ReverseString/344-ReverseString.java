// Last updated: 1/18/2026, 5:24:27 PM
1class Solution {
2    public int countPairs(List<Integer> nums, int target) {
3        Collections.sort(nums); // this sort the list(Build in fun.)
4        int i = 0;
5        int j = nums.size()-1;
6        int count = 0;
7
8        while(i < j){
9            int sum = nums.get(i) + nums.get(j);
10            if(sum >= target){
11                j--;
12            }
13            else{
14                count = count+(j-i);
15                i++;
16            }
17        }
18        return count;
19    }
20}