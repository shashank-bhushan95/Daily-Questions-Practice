// Last updated: 7/25/2026, 11:45:22 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3
4        char[] arr = s.toCharArray();
5
6        for (int i = 0; i < arr.length; i += 2 * k) {
7
8            int left = i;
9            int right = Math.min(i + k - 1, arr.length - 1);
10
11            while (left < right) {
12
13                char temp = arr[left];
14                arr[left] = arr[right];
15                arr[right] = temp;
16
17                left++;
18                right--;
19            }
20        }
21
22        return new String(arr);
23    }
24}