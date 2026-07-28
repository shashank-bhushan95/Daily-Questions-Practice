// Last updated: 7/28/2026, 4:50:28 PM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3
4        if (s.length() != goal.length()) return false;
5        if (s.length() == 0) return true;
6        char ch = goal.charAt(0);
7 
8        for (int index = 0; index < s.length(); index++) {
9            if (s.charAt(index) != ch) continue;
10            int i = index;
11            int j = 0;
12            boolean match = true;
13            // index se end tak compare
14            while (i < s.length()) {
15                if (s.charAt(i) != goal.charAt(j)) {
16                    match = false;
17                    break;
18                }
19                i++;
20                j++;
21            }
22            // beginning se index-1 tak compare
23            if (match) {
24                i = 0;
25                while (i < index) {
26                    if (s.charAt(i) != goal.charAt(j)) {
27                        match = false;
28                        break;
29                    }
30                    i++;
31                    j++;
32                }
33            }
34
35            if (match) {
36                return true;
37            }
38        }
39
40        return false;
41    }
42}