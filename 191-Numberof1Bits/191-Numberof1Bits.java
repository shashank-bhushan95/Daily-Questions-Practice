// Last updated: 7/20/2026, 11:12:30 PM
1class Solution {
2    public int hammingWeight(int n) {
3        //return Integer.bitCount(n);
4        int ans = 0;
5        while(n > 0){
6            int digit = n % 2;
7            if(digit == 1) ans++;
8            n = n / 2;
9        }
10        return ans;
11    }
12}