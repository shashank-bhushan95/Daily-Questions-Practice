// Last updated: 8/8/2026, 12:20:08 AM
1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sb = new StringBuilder();
4        int count = 0;
5        for(int i = 0; i < s.length(); i++){
6            char ch = s.charAt(i);
7            if(ch == '('){
8                if(count > 0){
9                    sb.append('(');
10                }
11                count++;
12            }
13            else{
14                count--;
15                if(count > 0){
16                    sb.append(')');
17                }
18            }
19        }
20        return sb.toString();
21    }
22}