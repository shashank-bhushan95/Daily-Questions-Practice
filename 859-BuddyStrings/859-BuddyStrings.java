// Last updated: 8/1/2026, 8:09:44 PM
1import java.util.HashMap;
2
3class Solution {
4    public boolean buddyStrings(String s, String goal) {
5
6        if (s.length() != goal.length())
7            return false;
8
9        HashMap<Character, Integer> map = new HashMap<>();
10
11        int diff = 0;
12        int first = -1;
13        int second = -1;
14
15        for (int i = 0; i < s.length(); i++) {
16
17            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
18
19            if (s.charAt(i) != goal.charAt(i)) {
20
21                diff++;
22
23                if (first == -1)
24                    first = i;
25                else
26                    second = i;
27            }
28        }
29
30        if (diff > 2)
31            return false;
32
33        if (diff == 2) {
34            return s.charAt(first) == goal.charAt(second)
35                    && s.charAt(second) == goal.charAt(first);
36        }
37
38        if (diff == 0) {
39
40            for (int freq : map.values()) {
41                if (freq >= 2)
42                    return true;
43            }
44
45            return false;
46        }
47
48        return false;
49    }
50}