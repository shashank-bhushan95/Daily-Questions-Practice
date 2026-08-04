// Last updated: 8/4/2026, 11:53:48 PM
1class Solution {
2    public boolean validMountainArray(int[] arr) {
3        int index = 0;
4        while(index < arr.length-1 && arr[index] < arr[index+1]){
5            index++;
6        }
7        if(index == arr.length-1 || index == 0) return false;
8        while(index < arr.length-1 && arr[index] > arr[index+1]){
9            index++;
10        }
11        return index == arr.length-1;
12    }
13}