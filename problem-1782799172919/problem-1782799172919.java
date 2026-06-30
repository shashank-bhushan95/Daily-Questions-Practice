// Last updated: 6/30/2026, 11:29:32 AM
1class Solution {
2    public String finalString(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i = 0; i < s.length(); i++){
5            char ch = s.charAt(i);
6            if(s.charAt(i) == 'i') sb.reverse();
7            else sb.append(ch);
8        }
9        String str = sb.toString();
10        return str;
11    }
12}