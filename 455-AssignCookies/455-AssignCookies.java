// Last updated: 6/27/2026, 7:42:24 PM
1class Solution {
2    public int findContentChildren(int[] g, int[] s) {
3        Arrays.sort(g);
4        Arrays.sort(s);
5
6        int gIndex = 0;
7        // loop sirf cookies par chalega
8        for (int sIndex = 0; gIndex < g.length && sIndex < s.length; sIndex++) {
9            if (g[gIndex] <= s[sIndex]) {
10                gIndex++; // agar bachha khush hua toh hi agle bachhe par jao
11            }
12        }
13        return gIndex; // gIndex hi aapka final answer hoga
14    }
15}