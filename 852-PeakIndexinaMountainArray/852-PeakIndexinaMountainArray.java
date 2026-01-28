// Last updated: 1/29/2026, 1:09:20 AM
1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int start = 0;
4        int end = arr.length-1;
5        while(start < end){
6            int mid = start + (end-start)/2;
7            if(arr[mid+1] > arr[mid]){
8                start = mid+1;
9            }
10            else{
11                end = mid;
12            }
13        }
14        return start;
15    }
16}