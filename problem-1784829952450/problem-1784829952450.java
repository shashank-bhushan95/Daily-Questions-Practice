// Last updated: 7/23/2026, 11:35:52 PM
1class Solution {
2    public int fib(int n) {
3        if(n == 0) return 0;
4        if(n == 1) return 1;
5        int n2 = 0;
6        int n1 = 1;
7        int ans = 0;
8        for(int i = 1; i < n; i++){
9            ans = n2 + n1;
10            n2 = n1;
11            n1 = ans;
12        }
13        return n1;
14    }
15}