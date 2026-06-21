// Last updated: 6/21/2026, 3:14:03 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        StringBuilder sb = new StringBuilder();
4        for(int i = k-1; i >= 0; i--){
5            sb.append(s.charAt(i));
6        }
7        for(int i = k; i < s.length(); i++){
8            sb.append(s.charAt(i));
9        }
10        s = sb.toString();
11        return s;
12    }
13}