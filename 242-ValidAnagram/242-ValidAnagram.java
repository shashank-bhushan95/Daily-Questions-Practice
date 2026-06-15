// Last updated: 6/15/2026, 12:49:03 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        char[] a = s.toCharArray();
4        char[] b = t.toCharArray();
5
6        Arrays.sort(a);
7        Arrays.sort(b);
8
9        return Arrays.equals(a,b);
10    }
11}