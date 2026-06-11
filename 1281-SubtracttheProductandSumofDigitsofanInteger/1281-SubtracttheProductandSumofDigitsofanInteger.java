// Last updated: 6/11/2026, 9:14:38 AM
1class Solution {
2    public int subtractProductAndSum(int n) {
3        int product = 1;
4        int sum = 0;
5
6        while(n > 0){
7            int digit = n % 10;
8            product = product * digit;
9            sum = sum + digit;
10
11            n = n / 10;
12        }
13
14        return (product - sum);
15    }
16}