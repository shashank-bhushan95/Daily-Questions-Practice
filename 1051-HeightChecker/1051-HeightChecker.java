// Last updated: 8/9/2026, 3:39:45 PM
1class Solution {
2    public void duplicateZeros(int[] arr) {
3        int[] ans = new int[arr.length];
4        int index = 0;
5        for(int i = 0; i < arr.length && index < arr.length; i++){
6            if(arr[i] == 0){
7                ans[index] = 0;
8                index++;
9                if(index < arr.length){
10                    ans[index] = 0;
11                    index++;
12                }
13            }
14            else{
15                ans[index] = arr[i];
16                index++;
17            }
18        }
19        for(int i = 0; i < arr.length; i++){
20            arr[i] = ans[i];
21        }
22    }
23}