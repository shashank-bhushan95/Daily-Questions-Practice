// Last updated: 1/29/2026, 11:00:28 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i = 0;
4        int j = numbers.length-1;
5        int[] ans = {-1,-1};
6        // [2,7,11,15]
7        //  i j
8        //sum = 
9        while(i < j){
10            int sum = numbers[i] + numbers[j];
11            if(sum > target){
12                j--;
13            }
14            else if(sum < target){
15                i++;
16            }
17            else{
18                ans[0] = i+1;
19                ans[1] = j+1;
20                return ans;
21            }
22        }
23        return ans;
24    }
25}