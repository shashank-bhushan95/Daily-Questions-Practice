// Last updated: 8/3/2026, 5:19:21 PM
1class Solution {
2    public String reverseOnlyLetters(String s) {
3        char[] arr = s.toCharArray();
4        int i = 0;
5        int j = arr.length - 1;
6        while (i < j) {
7            if (!((arr[i] >= 'A' && arr[i] <= 'Z') ||
8                  (arr[i] >= 'a' && arr[i] <= 'z'))) {
9                i++;
10            }
11            else if (!((arr[j] >= 'A' && arr[j] <= 'Z') ||
12                       (arr[j] >= 'a' && arr[j] <= 'z'))) {
13                j--;
14            }
15            else {
16                char temp = arr[i];
17                arr[i] = arr[j];
18                arr[j] = temp;
19                i++;
20                j--;
21            }
22        }
23        return new String(arr);
24    }
25}