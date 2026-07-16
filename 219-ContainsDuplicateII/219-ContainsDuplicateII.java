// Last updated: 7/16/2026, 10:22:58 AM
1class Solution {
2    public int firstUniqChar(String s) {
3        Queue<Character> q = new ArrayDeque<>();
4        HashSet<Character> duplicates = new HashSet<>();
5        for(int i = 0; i < s.length(); i++){
6            char ch = s.charAt(i);
7            if (!q.contains(ch) && !duplicates.contains(ch)) {
8                q.add(ch);
9            } 
10            else {
11                q.remove(ch);
12                duplicates.add(ch);
13            }
14        }
15        if(q.size() > 0){
16            int ans = 0;
17            char ansch = q.poll();
18            for(int i = 0; i < s.length(); i++){
19                if(ansch == s.charAt(i)){
20                    ans = i;
21                    break;
22                }
23            }
24            return ans;
25        }
26        return -1;
27    }
28}