// Last updated: 8/7/2025, 10:03:40 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        int size = nums.length;
        for(int i = 0; i < size; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        while(index < size){
            nums[index] = 0;
            index++;
        }
        System.out.println(nums);
    }
}