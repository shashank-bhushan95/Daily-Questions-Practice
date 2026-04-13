// Last updated: 4/13/2026, 2:39:30 PM
1class Solution {
2    public boolean helper(String s, int i, int j){
3        while(i <= j){
4            if(s.charAt(i) != s.charAt(j)) return false;
5            i++;
6            j--;
7        }
8        return true;
9    }
10
11    public boolean validPalindrome(String s) {
12        int i = 0;
13        int j = s.length()-1;
14
15        while(i < j){
16            if(s.charAt(i) != s.charAt(j)){
17                return helper(s, i+1, j) || helper(s, i, j-1);
18            }
19            i++;
20            j--;
21        }
22
23        return true;
24    }
25}