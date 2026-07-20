// Last updated: 7/21/2026, 12:49:49 AM
1class Solution {
2    public int addDigits(int num) {
3        while(num > 9){
4            int sum = 0;
5            while(num > 0){
6                int digit = num % 10;
7                sum += digit;
8                num = num / 10;
9            }
10            num = sum;
11        }
12        return num;
13    }
14}