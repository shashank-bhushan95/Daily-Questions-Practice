// Last updated: 8/7/2025, 10:03:49 PM
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        // }
        // if(count >= 1){
        //     return true;
        // }
        // else{
        //     return false;
        // }



        HashSet<Integer> a = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(a.contains(nums[i])) return true;
            a.add(nums[i]);
        }
        return false;
    }
}