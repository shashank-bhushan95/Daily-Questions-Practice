// Last updated: 7/19/2026, 3:48:50 PM
1class Solution {
2    public int romanToInt(String s) {
3        HashMap<Character, Integer> map = new HashMap<>();
4        map.put('I', 1);
5        map.put('V', 5);
6        map.put('X', 10);
7        map.put('L', 50);
8        map.put('C', 100);
9        map.put('D', 500);
10        map.put('M', 1000);
11
12        int total = 0;
13        int n = s.length();
14        for (int i = 0; i < n; i++) {
15            int currentVal = map.get(s.charAt(i));
16            if (i + 1 < n && currentVal < map.get(s.charAt(i + 1))) {
17                total -= currentVal;
18            } else {
19                total += currentVal;
20            }
21        }
22        return total;
23    }
24}