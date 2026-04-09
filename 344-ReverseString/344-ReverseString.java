// Last updated: 4/9/2026, 9:49:47 PM
1class Solution {
2    public void reverseString(char[] s) {
3        char[] help = new char[s.length];
4        int index = 0;
5
6        for(int i = 0; i < s.length; i++) help[i] = s[i];
7
8        for(int i = help.length-1; i >= 0; i--) {
9            s[index++] = help[i];
10        }
11        //return s;
12    }
13}