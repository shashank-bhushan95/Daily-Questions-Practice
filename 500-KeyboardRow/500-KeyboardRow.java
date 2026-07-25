// Last updated: 7/25/2026, 11:40:25 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3        StringBuilder sb = new StringBuilder();
4        for(int i = 0; i < s.length(); i++){
5            sb.append(s.charAt(i));
6        }
7    
8        for(int i = 0; i < s.length(); i += 2*k){
9            int start = i;
10            int end = Math.min(i+k-1, s.length()-1);
11            while(start <= end){
12                char temp = sb.charAt(start);
13                sb.setCharAt(start, sb.charAt(end));
14                sb.setCharAt(end, temp);
15                start++;
16                end--;
17            }
18        }
19        String str = sb.toString();
20        return str;
21    }
22}