// Last updated: 6/16/2026, 9:43:01 AM
1class Solution {
2    public int reverse(int x) {
3        long rev = 0;
4        // int copy = x;
5        while(x != 0){
6            int digit = x % 10;
7            x = x / 10;
8            rev = rev * 10 + digit;
9            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
10        }
11        
12        return (int) rev;
13    }
14}