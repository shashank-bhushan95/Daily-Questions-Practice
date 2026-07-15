// Last updated: 7/15/2026, 11:17:23 AM
1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        String[] words = s.split(" ");
4        
5        if (pattern.length() != words.length) {
6            return false;
7        }
8
9        HashMap<Character, String> map = new HashMap<>();
10
11        for (int i = 0; i < pattern.length(); i++) {
12            char ch = pattern.charAt(i);
13            String word = words[i];
14            if (map.containsKey(ch)) {
15                if (!map.get(ch).equals(word)) {
16                    return false;
17                }
18            } 
19            else {
20                if (map.containsValue(word)) {
21                    return false;
22                }
23                map.put(ch, word);
24            }
25        }
26
27        return true;
28    }
29}