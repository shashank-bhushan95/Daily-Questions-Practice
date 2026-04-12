// Last updated: 4/12/2026, 7:56:10 PM
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        // for(int i = 0; i < nums.length; i++){
4        //     int max = Integer.MAX_VALUE;
5        //     for(int j = i+1; j < nums.length; j++){
6        //         int sqI = nums[i] * nums[i];
7        //         int sqJ = nums[j] * nums[j];
8        //         if(sqI > sqJ){
9        //             if(max > sqJ){
10        //                 int temp = nums[i];
11        //                 nums[i] = nums[j];
12        //                 nums[j] = temp;
13        //                 max = nums[j]*nums[j];
14        //             }
15        //         }
16        //     }
17        //     nums[i] = nums[i] * nums[i];
18        // }
19        // return nums;
20
21        int i = 0;
22        int j = nums.length-1;
23        int index = j;
24        int[] ans = new int[j+1];
25
26        while(i <= j){
27            int sqI = nums[i] * nums[i];
28            int sqJ = nums[j] * nums[j]; 
29            if(sqJ > sqI){
30                ans[index] = sqJ;
31                j--;
32            }
33            else{
34                ans[index] = sqI;
35                i++;
36            }
37            index--;
38        }
39        return ans;
40    }
41}