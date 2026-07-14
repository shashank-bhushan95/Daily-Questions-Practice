// Last updated: 7/14/2026, 9:53:27 AM
1class Solution {
2    public boolean checkValidString(String s) {
3        Stack<Integer> openStack = new Stack<>();
4        Stack<Integer> starStack = new Stack<>();
5
6        for (int i = 0; i < s.length(); i++) {
7            char c = s.charAt(i);
8            
9            if (c == '(') {
10                openStack.push(i);
11            } else if (c == '*') {
12                starStack.push(i);
13            } else {
14                if (!openStack.isEmpty()) {
15                    openStack.pop();
16                } else if (!starStack.isEmpty()) {
17                    starStack.pop();
18                } else {
19                    return false;
20                }
21            }
22        }
23
24        while (!openStack.isEmpty() && !starStack.isEmpty()) {
25            if (openStack.peek() > starStack.peek()) {
26                return false;
27            }
28            openStack.pop();
29            starStack.pop();
30        }
31        return openStack.isEmpty();
32    }
33}