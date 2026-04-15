// Last updated: 4/15/2026, 10:54:36 PM
1class Solution {
2    public boolean isSameAfterReversals(int num) {
3        int reverse = 0;
4        int copy = num;
5        while(num > 0){
6            int digit = num % 10;
7            reverse = reverse * 10 + digit;
8            num = num / 10;
9        }
10
11        int rev = 0;
12        while(reverse > 0){
13            int digit = reverse % 10;
14            rev = rev*10+digit;
15            reverse/=10;
16        }
17
18        if(copy == rev) return true;
19        return false;
20
21        
22    }
23}