// Last updated: 6/24/2026, 12:44:03 AM
1class Solution {
2    public int maxVowels(String s, int k) {
3        int ans = 0;
4        int max = 0;
5        for(int i = 0; i < k; i++){
6            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
7                max = max + 1;
8            }
9        }
10        ans = max;
11        for(int i = k; i < s.length(); i++){
12            if(s.charAt(i-k) == 'a' || s.charAt(i-k) == 'e' || s.charAt(i-k) == 'i' || s.charAt(i-k) == 'o' || s.charAt(i-k) == 'u') {
13                max = max - 1;
14            }
15            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
16                max = max + 1;
17            }
18
19            ans = Math.max(ans, max);
20        }
21
22        return ans;
23    }
24}