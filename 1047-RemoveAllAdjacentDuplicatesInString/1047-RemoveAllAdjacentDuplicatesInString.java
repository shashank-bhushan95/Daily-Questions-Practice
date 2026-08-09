// Last updated: 8/9/2026, 2:43:21 PM
1class Solution {
2    public String removeDuplicates(String s) {
3        StringBuilder sb = new StringBuilder();
4        for(int i = 0; i < s.length(); i++){
5            char ch = s.charAt(i);
6            if(sb.length() > 0 && sb.charAt(sb.length()-1) == ch){
7                sb.deleteCharAt(sb.length()-1);
8            }
9            else{
10                sb.append(ch);
11            }
12        }
13        return sb.toString();
14    }
15}