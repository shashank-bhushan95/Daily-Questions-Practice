// Last updated: 7/14/2026, 9:14:55 AM
1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder sb = new StringBuilder();
4        int aIndex = a.length()-1;
5        int bIndex = b.length()-1;
6        int carry = 0;
7        while(aIndex >= 0 && bIndex >= 0){
8            int an = a.charAt(aIndex) - '0';
9            int bn = b.charAt(bIndex) - '0';
10            int sum = carry + an + bn;
11
12            if(sum == 3){
13                sb.append('1');
14                carry = 1;
15            }
16            else if(sum == 2){
17                sb.append('0');
18                carry = 1;
19            }
20            else{
21                sb.append(sum);
22                carry = 0;
23            }
24            aIndex--;
25            bIndex--;
26        } 
27        while(aIndex >= 0){
28            int an = a.charAt(aIndex) - '0';
29            int sum = carry + an;
30            if(sum == 2){
31                sb.append('0');
32                carry = 1;
33            }
34            else{
35                sb.append(sum);
36                carry = 0;
37            }
38            aIndex--;
39        }
40    
41        while(bIndex >= 0){
42            int bn = b.charAt(bIndex) - '0';
43            int sum = carry + bn;
44            if(sum == 2){
45                sb.append('0');
46                carry = 1;
47            }
48            else{
49                sb.append(sum);
50                carry = 0;
51            }
52            bIndex--;
53        }
54        if(carry == 1) sb.append(1);
55        sb.reverse();
56        String ans = sb.toString();
57        return ans;
58    }
59}