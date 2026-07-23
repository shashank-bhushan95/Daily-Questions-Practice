// Last updated: 7/23/2026, 2:46:59 PM
1class Solution {
2    public String convertToBase7(int num) {
3        if(num == 0) return "0";
4        StringBuilder sb = new StringBuilder();
5        boolean neg = false;
6        if(num < 0) neg = true;
7        int n = Math.abs(num);
8        while(n > 0){
9            int digit = n % 7;
10            sb.append(digit);
11            n = n / 7;
12        }
13        if(neg) sb.append('-');
14        String ans = sb.reverse().toString();;
15        return ans;
16    }
17}