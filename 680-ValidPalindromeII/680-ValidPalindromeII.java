// Last updated: 1/18/2026, 2:10:33 PM
1class Solution {
2    public boolean helper(int i, int j, String s){
3        while(i < j){
4            if(s.charAt(i) != s.charAt(j)){
5                return false;
6            }
7            i=i+1;
8            j=j-1;
9        }
10        return true;
11    }
12    public boolean validPalindrome(String s) {
13        int i = 0;
14        int j = s.length()-1;
15        while(i < j){
16            if(s.charAt(i) != s.charAt(j)){
17                return helper(i+1, j, s) || helper(i, j-1, s);
18            }
19            else{
20                i=i+1;
21                j=j-1;
22            }
23        }
24        return true;
25    }
26}