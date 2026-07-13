// Last updated: 7/13/2026, 12:49:53 PM
1class Solution {
2    public int lengthOfLastWord(String s) {
3        int i = s.length()-1;
4        int count = 0;
5        while(i >= 0 && s.charAt(i) == ' ') i--;
6        while(i >= 0 && s.charAt(i) != ' '){
7            i--;
8            count++;
9        }
10        return count;
11    }
12}