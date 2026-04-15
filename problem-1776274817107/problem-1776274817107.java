// Last updated: 4/15/2026, 11:10:17 PM
1class Solution {
2    public boolean isSameAfterReversals(int num) {
3        int reverse = 0;
4        int copy = num;
5        while(num > 0){
6            int digit = num % 10;
7            reverse = reverse * 10 + digit;
8            num = num / 10;
9        }
10        int rev = 0;
11        while(reverse > 0){
12            int digit = reverse % 10;
13            rev = rev * 10 + digit;
14            reverse /= 10;
15        }
16        if(copy == rev) return true;
17        return false;
18    }
19}