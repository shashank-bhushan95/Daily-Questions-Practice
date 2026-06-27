// Last updated: 6/27/2026, 7:35:27 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5
6        int gIndex = 0;
7        int sIndex = 0;
8        int ans = 0;
9
10        while(gIndex < g.length && sIndex < s.length){
11            if(g[gIndex] <= s[sIndex]){
12                ans++;
13                gIndex++;
14                sIndex++;
15            }
16
17            else{
18                sIndex++;
19            }
20        }
21
22        return ans;
23    }
24}