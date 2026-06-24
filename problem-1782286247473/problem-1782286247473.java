// Last updated: 6/24/2026, 1:00:47 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        int max1 = Integer.MIN_VALUE;
4        int max2 = Integer.MIN_VALUE;
5        int max3 = Integer.MIN_VALUE;
6
7        int min1 = Integer.MAX_VALUE;
8        int min2 = Integer.MAX_VALUE;
9
10        for(int i = 0; i < nums.length; i++){
11            if(nums[i] > max1){
12                max3 = max2;
13                max2 = max1;
14                max1 = nums[i];
15            }
16            else if(nums[i] > max2){
17                max3 = max2;
18                max2 = nums[i];
19            }
20            else if(nums[i] > max3) max3 = nums[i];
21
22            if (nums[i] < min1) {
23                min2 = min1;
24                min1 = nums[i];
25                
26            } else if (nums[i] < min2) {
27                min2 = nums[i];
28            }
29        }
30
31        int start = min1 * min2 * max1;
32        int end = max1 * max2 * max3;
33        return Math.max(start, end);
34    }
35}