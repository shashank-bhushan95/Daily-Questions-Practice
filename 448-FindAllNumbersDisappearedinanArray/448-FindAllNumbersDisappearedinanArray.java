// Last updated: 6/26/2026, 12:38:52 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        Arrays.sort(nums);
4        HashSet<Integer> hs = new HashSet<>();
5        for(int i = 0; i < nums.length; i++){
6            hs.add(nums[i]);
7        }
8
9        ArrayList<Integer> ans = new ArrayList<>();
10
11        for(int i = 1; i <= nums.length; i++){
12            if(hs.contains(i) == false){
13                ans.add(i);
14            }
15        }
16
17        return ans;
18    }
19}