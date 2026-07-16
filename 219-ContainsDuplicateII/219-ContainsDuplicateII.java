// Last updated: 7/16/2026, 11:10:43 AM
1class Solution {
2    public String addStrings(String num1, String num2) {
3        StringBuilder sb = new StringBuilder();
4        int num1len = num1.length()-1;
5        int num2len = num2.length()-1;
6        int carry = 0;
7        while(num1len >= 0 && num2len >= 0){
8            int n1 = num1.charAt(num1len) - '0';
9            int n2 = num2.charAt(num2len) - '0';
10            int sum = n1 + n2 + carry;
11            if(sum > 9){
12                carry = 1;
13                sb.append(sum - 10);
14            }
15            else{
16                carry = 0;
17                sb.append(sum);
18            }
19            num1len--;
20            num2len--;
21        }
22        while(num1len >= 0){
23            int n1 = num1.charAt(num1len) - '0';
24            int sum = n1 + carry;
25            if(sum > 9){
26                carry = 1;
27                sb.append(sum - 10);
28            }
29            else{
30                carry = 0;
31                sb.append(sum);
32            }
33            num1len--;
34        }
35        while(num2len >= 0){
36            int n2 = num2.charAt(num2len) - '0';
37            int sum = n2 + carry;
38            if(sum > 9){
39                carry = 1;
40                sb.append(sum - 10);
41            }
42            else{
43                carry = 0;
44                sb.append(sum);
45            }
46            num2len--;
47        }
48        if(carry == 1) sb.append(1);
49
50        sb.reverse();
51        String ans = sb.toString();
52        return ans;
53    }
54}