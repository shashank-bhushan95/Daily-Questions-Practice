// Last updated: 6/18/2026, 11:43:25 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        // for(int i = 0; i < nums.length; i++){
4        //     int Rsum = 0;
5        //     int Lsum = 0;
6        //     for(int j = i+1; j < nums.length; j++){
7        //         Rsum = Rsum + nums[j];
8        //     }
9        //     for(int k = i-1; k >= 0; k--){
10        //         Lsum = Lsum + nums[k];
11        //     }
12        //     if(Rsum == Lsum) return i;
13        // }
14        // return -1;
15
16        int[] LRsum = new int[nums.length];
17        LRsum[0] = nums[0];
18        for(int i = 1; i < nums.length; i++){
19            LRsum[i] = LRsum[i-1] + nums[i];
20        }
21
22        // int[] RLsum = new int[nums.length];
23        // RLsum[RLsum.length-1] = nums[nums.length-1];
24        // for(int i = RLsum.length-1; i >= 0; i--){
25        //     RLsum[i] = RLsum[i] + nums[i-1];
26        // }
27
28        for(int i = nums.length-2; i >= 0; i--){
29            nums[i] = nums[i] + nums[i+1];
30        }
31
32        for(int i = 0; i < nums.length; i ++){
33            if(LRsum[i] == nums[i]) return i;
34        }
35        return -1;
36    }
37}