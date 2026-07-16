// Last updated: 7/16/2026, 11:14:15 AM
1class Solution {
2    public String addStrings(String num1, String num2) {
3        StringBuilder sb = new StringBuilder();
4        int i = num1.length() - 1;
5        int j = num2.length() - 1;
6        int carry = 0;
7        while (i >= 0 || j >= 0 || carry > 0) {
8            int sum = carry;
9
10            if (i >= 0) {
11                sum += num1.charAt(i) - '0';
12                i--;
13            }
14
15            if (j >= 0) {
16                sum += num2.charAt(j) - '0';
17                j--;
18            }
19            sb.append(sum % 10);
20            carry = sum / 10;
21        }
22        return sb.reverse().toString();
23    }
24}