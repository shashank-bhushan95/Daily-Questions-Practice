// Last updated: 7/28/2026, 4:11:40 PM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        HashSet<Character> set = new HashSet<>();
4        for(int i = 0; i < jewels.length(); i++){
5            char ch = jewels.charAt(i);
6            set.add(ch);
7        }
8        int ans = 0;
9        for(int i = 0; i < stones.length(); i++){
10            char ch = stones.charAt(i);
11            if (set.contains(ch)) {
12                ans++;
13            }
14        }
15        return ans;
16    }
17}