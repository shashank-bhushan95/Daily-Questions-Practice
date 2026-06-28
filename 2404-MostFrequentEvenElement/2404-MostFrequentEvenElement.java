// Last updated: 6/28/2026, 11:06:40 PM
1class Solution {
2    public int mostFrequentEven(int[] nums) {
3        int ans = -1;
4        int maxFreq = 0;
5        HashMap<Integer, Integer> hm = new HashMap<>();
6        for(int i = 0; i < nums.length; i++){
7            if(nums[i] % 2 == 0){
8                hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
9            }
10        }
11
12        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
13            int currentNum = e.getKey();
14            int currentFreq = e.getValue();
15
16            if (currentFreq > maxFreq || (currentFreq == maxFreq && currentNum < ans)) {
17                maxFreq = currentFreq;
18                ans = currentNum;
19            }
20        }
21        return ans;
22    }
23}