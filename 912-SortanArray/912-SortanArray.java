// Last updated: 8/2/2026, 7:50:27 PM
1class Solution {
2    public int[] sortArray(int[] nums) {
3        mergeSort(nums, 0, nums.length - 1);
4        return nums;
5    }
6
7    public void mergeSort(int[] nums, int left, int right) {
8        if (left >= right) return;
9
10        int mid = left + (right - left) / 2;
11        mergeSort(nums, left, mid);
12        mergeSort(nums, mid + 1, right);
13        merge(nums, left, mid, right);
14    }
15
16    public void merge(int[] nums, int left, int mid, int right) {
17        int[] temp = new int[right - left + 1];
18        int i = left;
19        int j = mid + 1;
20        int k = 0;
21
22        while (i <= mid && j <= right) {
23            if (nums[i] <= nums[j]) temp[k++] = nums[i++];
24            else temp[k++] = nums[j++];
25        }
26        while (i <= mid) temp[k++] = nums[i++];
27        while (j <= right) temp[k++] = nums[j++];
28        for (int p = 0; p < temp.length; p++) {
29            nums[left + p] = temp[p];
30        }
31    }
32}