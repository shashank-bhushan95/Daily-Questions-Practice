// Last updated: 8/7/2025, 10:04:05 PM
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


        int index = 0;
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            if(nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}