// Last updated: 6/30/2026, 10:40:20 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] ans = {-1, -1};
4        int i = 0;
5        int j = nums.length-1;
6        
7        while(i <= j){
8            int mid = (i+j)/2;
9            if(nums[mid] == target){
10                ans[0] = mid;
11                ans[1] = mid;
12                for(int k = mid-1; k >= 0; k--){
13                  if(nums[k] == target) ans[0] = k; 
14                  else break; 
15                }
16                for(int k = mid+1; k < nums.length; k++){
17                    if(nums[k] == target) ans[1] = k;
18                    else break;
19                }
20                return ans;
21            }
22            else if(nums[mid] > target){
23                j = mid-1;
24            }
25            else{
26                i = mid+1;
27            }
28        }
29        return ans;
30    }
31}