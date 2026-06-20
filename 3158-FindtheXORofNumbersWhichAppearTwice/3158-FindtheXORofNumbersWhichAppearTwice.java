// Last updated: 6/20/2026, 3:40:25 PM
1class Solution {
2    public int duplicateNumbersXOR(int[] nums) {
3        int ans = 0;
4        HashMap<Integer, Integer> h = new HashMap<>();
5        for(int i = 0; i < nums.length; i++){
6            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
7        }
8
9        for(Integer num : h.keySet()){
10            if(h.get(num) == 2){
11                ans = ans ^ num;
12            }
13        }
14        return ans;
15    }
16}