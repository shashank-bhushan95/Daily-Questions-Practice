// Last updated: 7/15/2026, 10:22:59 AM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        
4        HashMap<Character, Integer> mapS = new HashMap<>();
5        HashMap<Character, Integer> mapT = new HashMap<>();
6        for(int i = 0; i < s.length(); i++){
7            char charS = s.charAt(i);
8            char charT = t.charAt(i);
9            if (!mapS.getOrDefault(charS, -1).equals(mapT.getOrDefault(charT, -1))) {
10                return false;
11            }
12            mapS.put(charS, i);
13            mapT.put(charT, i);
14        }
15
16        return true;
17    }
18}