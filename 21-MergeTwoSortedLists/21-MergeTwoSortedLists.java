// Last updated: 7/13/2026, 11:25:28 AM
1class Solution {
2    public int strStr(String haystack, String needle) {
3        if (needle.length() == 0) return 0;
4        int i = 0;
5        int j = 0;
6        int indx = 0;
7        while(i < haystack.length()){
8            if(haystack.charAt(i) != needle.charAt(j)) i++;
9            else{
10                indx = i;
11                while(j < needle.length() && i < haystack.length()){
12                    if(needle.charAt(j) != haystack.charAt(i)) {
13                        j = 0;
14                        i = indx+1;
15                        break;
16                    }
17                    else{
18                        i++;
19                        j++;
20                    }
21                }
22                if(j == needle.length()) return i-needle.length();
23            }
24        }
25        return -1;
26    }
27}