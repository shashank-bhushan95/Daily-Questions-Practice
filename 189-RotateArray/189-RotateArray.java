// Last updated: 8/7/2025, 10:03:51 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length;
        int index = 0;
        int arr[] = new int[size];
        int rem = k % size;
        for(int i = (size - rem); i < size; i++){
            arr[index] = nums[i];
            index++;
        }
        for(int i = 0; i < (size - rem); i++){
            arr[index++] = nums[i];
        }
        for(int i = 0; i < size; i++){
            nums[i] = arr[i];
        }
        System.out.print(nums);
    }
}