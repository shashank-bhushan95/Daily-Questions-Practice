// Last updated: 8/19/2025, 9:38:10 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        // HashSet<Integer> a = new HashSet<>();
        // for(int itr : nums){
        //     a.add(itr);
        // }
        // int size = a.size();
        // int ans[] = new int[size];
        // int index = 0;
        // for(int itr : a){
        //     ans[index++] = a;
        // }
        // return ans;


        if(nums.length == 0) return 0;
        int index = 0;
        for(int i=1; i<nums.length;i++){
            if(nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}