// Last updated: 6/26/2026, 12:22:57 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        ArrayList<Integer> ans = new ArrayList<>();
4        Arrays.sort(nums);
5        int num = 1;
6        for(int i = 0; i < nums.length; i++){
7            while(num < nums[i]){
8                ans.add(num);
9                num++;
10            }
11            if (i < nums.length - 1 && nums[i] == nums[i+1]) {
12                continue; 
13            }
14            if(num == nums[i]) num++;
15        }
16
17        while(num <= nums.length) ans.add(num++);
18        
19        return ans;
20    }
21}