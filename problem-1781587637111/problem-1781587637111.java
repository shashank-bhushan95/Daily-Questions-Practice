// Last updated: 6/16/2026, 10:57:17 AM
1import java.util.*;
2class Solution {
3    public boolean containsDuplicate(int[] nums) {
4        int count = 0;
5        // for(int i = 0; i < nums.length; i++){
6        //     for(int j = i+1; j < nums.length; j++){
7        //         if(nums[i] == nums[j]){
8        //             count++;
9        //         }
10        //     }
11        // }
12        // if(count >= 1){
13        //     return true;
14        // }
15        // else{
16        //     return false;
17        // }
18
19
20
21        HashSet<Integer> a = new HashSet<>();
22        for(int i = 0; i < nums.length; i++){
23            if(a.contains(nums[i])) return true;
24            a.add(nums[i]);
25        }
26        return false;
27    }
28}