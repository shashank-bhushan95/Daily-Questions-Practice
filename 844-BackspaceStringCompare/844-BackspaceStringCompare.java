// Last updated: 7/14/2026, 10:46:06 AM
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack<Character> a = new Stack<>();
4        Stack<Character> b = new Stack<>();
5
6        for(int i = 0; i < s.length(); i++){
7            char ch = s.charAt(i);
8            if(ch != '#') a.push(ch);
9            else if (!a.isEmpty()) {
10                a.pop();
11            }
12        }
13
14        for(int i = 0; i < t.length(); i++){
15            char ch = t.charAt(i);
16            if(ch != '#') b.push(ch);
17            else if (!b.isEmpty()) {
18                b.pop();
19            }
20        }
21
22        if (a.size() != b.size()) return false;
23        while(!a.isEmpty()){
24            if(a.pop() != b.pop()){
25                return false;
26            }
27        }
28        return true;
29    }
30}