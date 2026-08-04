// Last updated: 8/4/2026, 2:25:14 PM
1class Solution {
2    public int[] sortArrayByParityII(int[] nums) {
3        int index = 0;
4        int i = 0;
5        //int j = 1;
6        while(i < nums.length){
7            // if(i % 2 == 0 && nums[i] % 2 == 0) i++;
8            // else if(i % 2 != 0 && nums[i] % 2 != 0) i++;
9            if(i % 2 == 0 && nums[i] % 2 != 0){
10                int j = i+1;
11                while(j < nums.length){
12                    if(nums[j] % 2 == 0){
13                        int temp = nums[i];
14                        nums[i] = nums[j];
15                        nums[j] = temp;
16                        break;
17                    }
18                    j++;
19                }
20            }
21            else if(i % 2 != 0 && nums[i] % 2 == 0){
22                int j = i+1;
23                while(j < nums.length){
24                    if(nums[j] % 2 != 0){
25                        int temp = nums[i];
26                        nums[i] = nums[j];
27                        nums[j] = temp;
28                        break;
29                    }
30                    j++;
31                }
32            }
33            i++;
34        }
35        return nums;
36    }
37}