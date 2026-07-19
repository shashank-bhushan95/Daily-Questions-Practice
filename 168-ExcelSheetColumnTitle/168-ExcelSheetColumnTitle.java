// Last updated: 7/20/2026, 12:58:34 AM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        //int mod = columnNumber % 26;
4        StringBuilder sb = new StringBuilder();
5        while(columnNumber > 0){
6            columnNumber--;
7            int n = columnNumber % 26;
8            char ch = (char) ('A' + n);
9            sb.append(ch);
10            columnNumber = columnNumber / 26;
11        }
12        
13        String ans = sb.reverse().toString();
14        return ans;
15    }
16}