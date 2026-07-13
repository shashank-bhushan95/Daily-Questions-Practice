// Last updated: 7/13/2026, 12:25:06 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(needle.length() == 0) return -1;
4        int count  = 0;
5        int j = 0;
6        for(int i = 0; i < haystack.length(); i++){
7            if(haystack.charAt(i) != needle.charAt(j)){
8                if (count > 0) {
9                    i = i - count;
10                }
11                j = 0;
12                count = 0;
13            }
14            else{
15                j++;
16                count++;
17                if(count == needle.length()) return i-needle.length()+1;
18            }
19        }
20        return -1;
21    }
22}