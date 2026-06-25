// Last updated: 6/26/2026, 12:42:28 AM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        
5        // Step 1: Single loop se elements ko unke index par negative mark karo
6        for (int i = 0; i < nums.length; i++) {
7            // Math.abs isliye taaki agar koi number pehle se negative ho chuka ho, toh sahi index mile
8            int index = Math.abs(nums[i]) - 1; 
9            
10            // Agar us index par value positive hai, toh use negative kar do
11            if (nums[index] > 0) {
12                nums[index] = -nums[index];
13            }
14        }
15        
16        // Step 2: Ek aur single loop chalakar check karo kaunsa index positive reh gaya
17        for (int i = 0; i < nums.length; i++) {
18            if (nums[i] > 0) {
19                ans.add(i + 1); // i-th index positive hai matlab (i + 1) missing tha
20            }
21        }
22        
23        return ans;
24    }
25}