// Last updated: 6/28/2026, 11:24:28 PM
1class Solution {
2    public int mostFrequentEven(int[] nums) {
3        if(nums.length == 1 && nums[0]%2==0) return nums[0];
4        Arrays.sort(nums);
5        int ans = -1;
6        int countMax = 0;
7        for(int i = 0; i < nums.length; i++){
8            int count = 1;
9            if(nums[i] % 2 != 0) continue;
10            for(int j = i+1; j < nums.length; j++){
11                if(nums[i] == nums[j]){
12                    count++;
13                }
14                else break;
15            }
16            if (count > countMax) {
17                ans = nums[i];
18                countMax = count;
19            }
20        }
21        return ans;
22    }
23}