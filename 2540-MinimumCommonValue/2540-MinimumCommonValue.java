// Last updated: 7/12/2026, 1:16:10 AM
1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        if (strs == null || strs.length == 0) return "";
4        for (int i = 0; i < strs[0].length(); i++) {
5            char c = strs[0].charAt(i);
6            for (int j = 1; j < strs.length; j++) {
7                if (i == strs[j].length() || strs[j].charAt(i) != c) {
8                    return strs[0].substring(0, i);
9                }
10            }
11        }
12        
13        return strs[0];
14    }
15}
16