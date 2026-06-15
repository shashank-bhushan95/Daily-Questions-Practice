// Last updated: 6/15/2026, 12:23:24 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3
4        // String s = x + "";
5        // int i = 0;
6        // int j = s.length()-1;
7        // while(i < j){
8        //     if(s.charAt(i) != s.charAt(j)){
9        //         return false;
10        //     }
11        //     i++;
12        //     j--;
13        // }
14        // return true;
15
16        int rev = 0;
17        int copy = x;
18        int digit = 0;
19        while(copy > 0){
20            digit = copy % 10;
21            rev = rev * 10 + digit;
22            copy = copy / 10;
23        }
24        if(rev == x) return true;
25        return false;
26    }
27}