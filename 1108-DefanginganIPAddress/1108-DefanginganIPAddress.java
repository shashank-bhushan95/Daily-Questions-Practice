// Last updated: 8/9/2026, 3:46:40 PM
1class Solution {
2    public String defangIPaddr(String address) {
3        StringBuilder sb = new StringBuilder();
4        for(int i = 0; i < address.length(); i++){
5            char ch = address.charAt(i);
6            if(ch == '.'){
7                sb.append("[.]");
8            }
9            else {
10                sb.append(ch);
11            }
12        }
13        return sb.toString();
14    }
15}