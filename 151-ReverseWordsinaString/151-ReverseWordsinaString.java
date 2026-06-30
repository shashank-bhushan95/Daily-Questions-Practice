// Last updated: 6/30/2026, 11:38:50 PM
1class Solution {
2    public String reverseWords(String s) {
3        String cleanStr = s.trim().replaceAll("\\s+", " ");
4        String[] str = cleanStr.split(" ");
5        int start = 0;
6        int end = str.length -1;
7        while(start < end){
8            String temp = str[start];
9            str[start] = str[end];
10            str[end]  = temp;
11            start++;
12            end--;
13        }
14
15        String ans = String.join(" ", str);
16        return ans; 
17    }
18}