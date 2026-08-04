// Last updated: 8/4/2026, 3:09:40 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i = 0;
4        int j = 0;
5        while(i < name.length() && j < typed.length()){
6            char nc = name.charAt(i);
7            char tc = typed.charAt(j);
8            if(nc == tc){
9                j++;
10                i++;
11            }
12            else if(nc != tc){
13                if(j > 0 && typed.charAt(j) == typed.charAt(j-1)) j++;
14                else return false;
15            }
16        }
17        while(j < typed.length()) {
18            if(typed.charAt(j) != typed.charAt(j - 1))
19                return false;
20            j++;
21        }
22        return i == name.length();
23    }
24}