// Last updated: 6/30/2026, 12:13:49 AM
1class Solution {
2    public int flipgame(int[] fronts, int[] backs) {
3        // Since max possible card value is 2000, we use a fixed boolean array
4        boolean[] isBanned = new boolean[2001];
5        int n = fronts.length;
6        for (int i = 0; i < n; i++) {
7            if (fronts[i] == backs[i]) {
8                isBanned[fronts[i]] = true;
9            }
10        }
11
12        int ans = Integer.MAX_VALUE;
13        for (int i = 0; i < n; i++) {
14            if (fronts[i] < ans && !isBanned[fronts[i]]) {
15                ans = fronts[i];
16            }
17            if (backs[i] < ans && !isBanned[backs[i]]) {
18                ans = backs[i];
19            }
20        }
21
22        if(ans == Integer.MAX_VALUE) return 0;
23        return ans;
24        
25    }
26}
27