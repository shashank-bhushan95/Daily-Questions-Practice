// Last updated: 6/15/2026, 11:23:41 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3        // if(x < 0){
4        //     return false;
5        // }
6        String s = x + "";
7        int i = 0;
8        int j = s.length()-1;
9        while(i < j){
10            if(s.charAt(i) != s.charAt(j)){
11                return false;
12            }
13            i++;
14            j--;
15        }
16        return true;
17    }
18}