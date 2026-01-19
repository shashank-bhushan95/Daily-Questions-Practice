// Last updated: 1/20/2026, 12:06:12 AM
1class Solution {
2    public int appendCharacters(String s, String t) {
3        int i = 0;
4        int j = 0;
5        int ans = 0;
6        while(i < s.length() && j < t.length()){
7            if(s.charAt(i) == t.charAt(j)){
8                j++;
9            }
10            i++;
11        }
12        return ans = t.length() - j;
13    }
14}