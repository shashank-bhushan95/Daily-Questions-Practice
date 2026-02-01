// Last updated: 2/1/2026, 11:52:00 PM
1class Solution {
2    public static void sumHelper(int[] nums, List<List<Integer>> ans, int i){
3        int start = i + 1;
4        int end = nums.length-1;
5        while(start < end){
6            int sum = nums[i] + nums[start] + nums[end];
7            if(sum == 0){
8                ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
9                start++;
10                end--;
11
12                while(start < end && nums[start] == nums[start-1]){
13                    start++;
14                }
15                while(start < end && nums[start] == nums[end+1]){
16                    end--;
17                }
18            }
19            else if(sum > 0){
20                end--;
21            }
22            else{
23                start++;
24            }
25        }
26    }
27    public List<List<Integer>> threeSum(int[] nums) {
28        Arrays.sort(nums);
29        List<List<Integer>> ans = new ArrayList<>();
30        
31
32        for(int i = 0; i < nums.length; i++){
33            if(nums[i] > 0){
34                break;
35            }
36            if(i == 0 || nums[i] != nums[i-1]){
37                sumHelper(nums, ans, i);
38            }
39            
40        }
41        return ans;
42    }
43}