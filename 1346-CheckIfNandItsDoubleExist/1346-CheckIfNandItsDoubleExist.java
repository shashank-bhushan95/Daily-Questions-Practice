// Last updated: 6/25/2026, 10:26:56 AM
1class Solution {
2    public boolean checkIfExist(int[] arr) {
3        for(int i = 0; i < arr.length; i++){
4            for(int j = 0; j < arr.length; j++){
5                if(arr[i] == arr[j] * 2 && i != j) return true;
6            }
7        }
8        return false;
9    }
10}