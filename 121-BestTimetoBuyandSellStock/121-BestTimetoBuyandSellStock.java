// Last updated: 7/14/2026, 10:41:14 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        HashMap<Integer, Integer> hm = new HashMap<>();
4        for(int i = 0; i < nums.length; i++){
5            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
6        }
7
8        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
9            if(entry.getValue() == 1) return entry.getKey();
10            //System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
11        }
12        return 0;
13    }
14}