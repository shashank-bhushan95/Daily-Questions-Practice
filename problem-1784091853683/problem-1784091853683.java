// Last updated: 7/15/2026, 10:34:13 AM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3
4        HashMap<Character, Integer> map = new HashMap<>();
5        for (int i = 0; i < magazine.length(); i++) {
6            char ch = magazine.charAt(i);
7            map.put(ch, map.getOrDefault(ch, 0) + 1);
8        }
9
10        for (int i = 0; i < ransomNote.length(); i++) {
11            char ch = ransomNote.charAt(i);
12            if (!map.containsKey(ch) || map.get(ch) == 0) {
13                return false;
14            }
15            map.put(ch, map.get(ch) - 1);
16        }
17
18        return true;
19    }
20}