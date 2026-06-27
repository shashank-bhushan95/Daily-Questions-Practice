// Last updated: 6/28/2026, 1:25:36 AM
1class Solution {
2    public char repeatedCharacter(String s) {
3        boolean[] visited = new boolean[26];
4        for (int i = 0; i < s.length(); i++) {
5            char ch = s.charAt(i);
6            int index = ch - 'a';
7            if (visited[index] == true) {
8                return ch;
9            }
10            visited[index] = true;
11        }
12
13        return ' ';
14    }
15}
16