// Last updated: 8/9/2026, 4:12:09 PM
1class Solution {
2    public int[] relativeSortArray(int[] arr1, int[] arr2) {
3        int[] freq = new int[1001];
4        int[] ans = new int[arr1.length];
5        for(int i = 0; i < arr1.length; i++){
6            freq[arr1[i]]++;
7        }
8        int index = 0;
9        for(int i = 0; i < arr2.length; i++){
10            int count = freq[arr2[i]];
11            while(count > 0){
12                ans[index] = arr2[i];
13                count--;
14                freq[arr2[i]]--;
15                index++;
16            }
17        }
18        for (int num = 0; num < freq.length; num++) {
19            while (freq[num] > 0) {
20                ans[index++] = num;
21                freq[num]--;
22            }
23        }
24        return ans;
25    }
26}