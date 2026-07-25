// Last updated: 7/25/2026, 11:04:20 PM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        int low = 0;
4        int upp = 0;
5        for(int i = 0; i < word.length(); i++){
6            char ch = word.charAt(i);
7            if(ch >= 'a' && ch <= 'z') low++;
8            else upp++;
9        }
10        if (upp == word.length()) return true;
11        if (low == word.length()) return true;
12        if (upp == 1 && Character.isUpperCase(word.charAt(0))) return true;
13        return false;
14    }
15}